package com.hrms.utility;

import java.util.logging.Logger;


public class Log {//initialize log4j logs
	private static Logger Log = Logger.getLogger(Log.class.getName());
	//need to create these methods so that they can be called
	public static void info(String message) {
		Log.info(message);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
