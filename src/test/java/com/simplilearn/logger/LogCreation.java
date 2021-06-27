package com.simplilearn.logger;


import java.io.FileWriter;

public class LogCreation {

	FileWriter myLogs;
	public String createlogger(String file) {
		
		
		try {
			myLogs = new FileWriter(file+".log");
		} catch (Exception e) {
			return e.getMessage();
		}
		return "Successful";
	}
	
	public String writeLogger(String logs) {
		try {
			myLogs.write(logs);
		} catch (Exception e) {
			return e.getMessage();
		}
		return "Successful";
	}
	
	public String closeLogger() {
		try {
			myLogs.close();
		} catch (Exception e) {
			return e.getMessage();
		}
		return "Successful";
	}
	
}
