package com.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	private Properties properies;
	
	public Properties init() {
		properies = new Properties();
		try {
			FileInputStream fileInputStream = new FileInputStream("./src/test/resources/config/config.properties");
			properies.load(fileInputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properies;
	}

}
