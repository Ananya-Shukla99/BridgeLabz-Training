package com.codeCraft;

public class Submission {

	public String userId;
	public String projectCode;
	public String durationInMinutes;
	public long score;
	
	
	public Submission(String userId, String projectCode, String durationInMinutes, long score) {
		
		this.userId = userId;
		this.projectCode = projectCode;
		this.durationInMinutes = durationInMinutes;
		this.score = score;
	}
	
}
