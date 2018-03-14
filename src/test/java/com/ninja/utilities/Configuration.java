package com.ninja.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	private Configuration() { }
	private static Properties properties;
	static {
		try {
			properties =new Properties();
			FileInputStream input = new FileInputStream("./ConfigurationsDemo");
			properties.load(input);
			
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static String getProperties(String key) {
		return properties.getProperty(key);
	}
}
