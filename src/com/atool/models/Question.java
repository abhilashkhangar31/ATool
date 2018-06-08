package com.atool.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * 
 * @author ABHILASH KHANGAR
 *
 */
@Component
@Entity
@Table(name = "question")
public class Question implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "q_id")
	private Long questionId;
	
	@Column(name = "q_stmt")
	private String questionStatement;
	
	private Timestamp creationtime;

	private Timestamp lastmodified;
	
	@OneToMany(mappedBy = "question")
	private List<AnswerChoiceGroupMap> answerChoiceGroupMaps;
	
	@OneToMany(mappedBy = "question")
	private List<CorrectAnswer> correctAnswers;
	
	@OneToMany(mappedBy = "question")
	private List<MetaInfo> metaInfos;
	
	@OneToMany(mappedBy = "question")
	private List<QuestionAnswerChoiceMap> questionAnswerChoiceMaps;
	
	@ManyToOne
	@JoinColumn(name = "q_qt_id")
	private QuestionType questionType;
	
	@OneToMany(mappedBy = "question")
	private List<QuestionTagMap> questionTagMaps;
	
	@OneToMany(mappedBy = "question")
	private List<QuestionTagBelongsToMap> questionTagBelongsToMaps;
	
	/**
	 *
	 */
	public Question() {
		this.creationtime = new Timestamp(new Date().getTime());
	}

	/**
	 * 
	 * @param questionId
	 * @param questionStatement
	 * @param creationtime
	 * @param lastmodified
	 * @param answerChoiceGroupMaps
	 * @param correctAnswers
	 * @param metaInfos
	 * @param questionAnswerChoiceMaps
	 * @param questionType
	 * @param questionTagMaps
	 * @param aqQuestionToBelongsTos
	 */
	public Question(Long questionId, String questionStatement, Timestamp creationtime, Timestamp lastmodified,
			List<AnswerChoiceGroupMap> answerChoiceGroupMaps, List<CorrectAnswer> correctAnswers,
			List<MetaInfo> metaInfos, List<QuestionAnswerChoiceMap> questionAnswerChoiceMaps, QuestionType questionType,
			List<QuestionTagMap> questionTagMaps, List<QuestionTagBelongsToMap> questionTagBelongsToMaps) {
		super();
		this.questionId = questionId;
		this.questionStatement = questionStatement;
		this.creationtime = creationtime;
		this.lastmodified = lastmodified;
		this.answerChoiceGroupMaps = answerChoiceGroupMaps;
		this.correctAnswers = correctAnswers;
		this.metaInfos = metaInfos;
		this.questionAnswerChoiceMaps = questionAnswerChoiceMaps;
		this.questionType = questionType;
		this.questionTagMaps = questionTagMaps;
		this.questionTagBelongsToMaps = questionTagBelongsToMaps;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public String getQuestionStatement() {
		return questionStatement;
	}

	public void setQuestionStatement(String questionStatement) {
		this.questionStatement = questionStatement;
	}

	public Timestamp getCreationtime() {
		return creationtime;
	}

	public void setCreationtime(Timestamp creationtime) {
		this.creationtime = creationtime;
	}

	public Timestamp getLastmodified() {
		return lastmodified;
	}

	public void setLastmodified(Timestamp lastmodified) {
		this.lastmodified = lastmodified;
	}

	public List<AnswerChoiceGroupMap> getAnswerChoiceGroupMaps() {
		return answerChoiceGroupMaps;
	}

	public void setAnswerChoiceGroupMaps(List<AnswerChoiceGroupMap> answerChoiceGroupMaps) {
		this.answerChoiceGroupMaps = answerChoiceGroupMaps;
	}

	public List<CorrectAnswer> getCorrectAnswers() {
		return correctAnswers;
	}

	public void setCorrectAnswers(List<CorrectAnswer> correctAnswers) {
		this.correctAnswers = correctAnswers;
	}

	public List<MetaInfo> getMetaInfos() {
		return metaInfos;
	}

	public void setMetaInfos(List<MetaInfo> metaInfos) {
		this.metaInfos = metaInfos;
	}

	public List<QuestionAnswerChoiceMap> getQuestionAnswerChoiceMaps() {
		return questionAnswerChoiceMaps;
	}

	public void setQuestionAnswerChoiceMaps(List<QuestionAnswerChoiceMap> questionAnswerChoiceMaps) {
		this.questionAnswerChoiceMaps = questionAnswerChoiceMaps;
	}

	public QuestionType getQuestionType() {
		return questionType;
	}

	public void setQuestionType(QuestionType questionType) {
		this.questionType = questionType;
	}

	public List<QuestionTagMap> getQuestionTagMaps() {
		return questionTagMaps;
	}

	public void setQuestionTagMaps(List<QuestionTagMap> questionTagMaps) {
		this.questionTagMaps = questionTagMaps;
	}

	public List<QuestionTagBelongsToMap> getQuestionTagBelongsToMaps() {
		return questionTagBelongsToMaps;
	}

	public void setQuestionTagBelongsToMaps(List<QuestionTagBelongsToMap> questionTagBelongsToMaps) {
		this.questionTagBelongsToMaps = questionTagBelongsToMaps;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionStatement=" + questionStatement + ", creationtime="
				+ creationtime + ", lastmodified=" + lastmodified + ", answerChoiceGroupMaps=" + answerChoiceGroupMaps
				+ ", correctAnswers=" + correctAnswers + ", metaInfos=" + metaInfos + ", questionAnswerChoiceMaps="
				+ questionAnswerChoiceMaps + ", questionType=" + questionType + ", questionTagMaps=" + questionTagMaps
				+ ", questionTagBelongsToMaps=" + questionTagBelongsToMaps + "]";
	}

}
