package com.prathyusha.springs.springCore;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question2 {
	private long questionId;
	private String question;
	 private List<String> listAnswer;
	   private Set<String> setAnswer;
	   private Map<Integer,String> mapAnswer;
	public long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getListAnswer() {
		return listAnswer;
	}
	public void setListAnswer(List<String> listAnswer) {
		this.listAnswer = listAnswer;
	}
	public Set<String> getSetAnswer() {
		return setAnswer;
	}
	public void setSetAnswer(Set<String> setAnswer) {
		this.setAnswer = setAnswer;
	}
	public Map<Integer, String> getMapAnswer() {
		return mapAnswer;
	}
	public void setMapAnswer(Map<Integer, String> mapAnswer) {
		this.mapAnswer = mapAnswer;
	}
	@Override
	public String toString() {
		return "Question2 [questionId=" + questionId + ", question=" + question
				+ ", listAnswer=" + listAnswer + ", setAnswer=" + setAnswer
				+ ", mapAnswer=" + mapAnswer + "]";
	}
	
	
}
