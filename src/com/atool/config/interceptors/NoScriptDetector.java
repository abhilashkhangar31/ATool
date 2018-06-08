package com.atool.config.interceptors;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URIBuilder;
import org.springframework.web.filter.GenericFilterBean;

public class NoScriptDetector extends GenericFilterBean {

	private static final String NO_SCRIPT_PARAM = "noScript";
	private String noScriptPage = "/WEB-INF/views/noScriptHandler.jsp";
	
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		if( hasParameter(request.getParameterNames(), NO_SCRIPT_PARAM )) {
			String requestUrl = null;
			try {
				requestUrl= removeQueryParameter( request.getRequestURL() + "?" + request.getQueryString(), NO_SCRIPT_PARAM );
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
			request.setAttribute("requestUrl", requestUrl);
			request.getRequestDispatcher(noScriptPage).forward(servletRequest, servletResponse);
		}
			
		chain.doFilter(servletRequest, servletResponse);
	}
	
	public boolean hasParameter(Enumeration<String> requestParams, String param) {
		while (requestParams.hasMoreElements()) {
			String paramName = (String) requestParams.nextElement();
			if( paramName.equals(param) ) return true;
		}
		return false;
	}
	
	public String removeQueryParameter(String url, String parameterName) throws URISyntaxException {
	    URIBuilder uriBuilder = new URIBuilder(url);
	    List<NameValuePair> queryParameters = uriBuilder.getQueryParams()
										              	.stream()
										              	.filter(p -> !p.getName().equals(parameterName))
										              	.collect(Collectors.toList());
	    if (queryParameters.isEmpty()) {
	        uriBuilder.removeQuery();
	    } else {
	    	for (NameValuePair nameValuePair : queryParameters) {
	    		uriBuilder.setParameter(nameValuePair.getName(), nameValuePair.getValue());
			}
	    }
	    return uriBuilder.build().toString();
	}

}
