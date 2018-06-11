package com.atool.utils;

import java.io.IOException;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class TimeDeserializer extends JsonDeserializer<Time> {

	@SuppressWarnings("deprecation")
	@Override
	public Time deserialize(JsonParser parser, DeserializationContext ctx) throws IOException, JsonProcessingException {
		long timeInMilisecond = parser.getValueAsLong();
		long seconds = TimeUnit.MILLISECONDS.toSeconds(timeInMilisecond);
		Time time = new Time(0, 0, (int) seconds);
		return time;
	}

}
