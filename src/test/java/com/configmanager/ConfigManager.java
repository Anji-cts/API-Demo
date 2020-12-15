package com.configmanager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Logger;



/**
 * This class provides methods to read values of keys from either app.properties
 * or sys.properties from "ConfigFiles" folder
 */
public class ConfigManager {
	private Properties properties = new Properties();
	private String configFileName;
	private Logger log = Logger.getLogger("ConfigManager");
	private String fileSeperator = System.getProperty("file.separator");

	// The default constructor initializes and reads the key values from
	// sys.properties file
	public ConfigManager() {
		configFileName = "Sys";
	}

	// The parameterized constructor when supplied with "app" as configFile name
	// initializes and
	// reads the key values from app.properties
	public ConfigManager(String configname) {
		configFileName = configname;
	}

	/**
	 * Returns the value of given property from either sys.properties or
	 * app.properties file
	 * 
	 * @param key
	 *            - ConfigParamvalue that requires to be returned from
	 *            Config.properties file
	 * @return - return ConfigValue
	 */
	public String getProperty(String key) {
		String value = "";
		if (key != "") {
			loadProperties();
			try {
				if (!properties.getProperty(key).trim().isEmpty())
					value = properties.getProperty(key).trim();
			} catch (NullPointerException e) {
				
			}
		} else {
			log.error("key cannot be null.. ");
			
		}
		return value;
	}

	/**
	 * 
	 * This method is used to load properties file that has to be accessed
	 *
	 */
	private void loadProperties() {
		FileInputStream fis;
		try {
			fis = new FileInputStream(getConfigFilePath(configFileName));
			properties.load(fis);
			fis.close();
		} catch (FileNotFoundException e) {
			log.error("Cannot find configuration file - " + configFileName + ".properties" + " at "
					+ getConfigFilePath(configFileName));
			
		} catch (IOException e) {
			log.error("Cannot read configuration file - " + " at " + getConfigFilePath(configFileName));
			
		}
	}

	/**
	 * This method helps to write any new key value pairs to app.properties
	 * file.
	 * 
	 * @param sKey
	 * @param sData
	 */
	

	/**
	 * This method helps to write the failure test data to
	 * Failure_list.properties file.
	 * 
	 * @param sKey
	 * @param sData
	 */
	
	/**
	 * This method helps to clean the failure test data in
	 * "FailedTestCases.properties" file
	 */
	
	
	/**
	 * This method helps to write the execution time in "FailedTestCases.properties" file
	 */
	
	/**
	 * 
	 * This method is used to get the path of specified properties file name
	 *
	 * @param File
	 *            , Need to pass the name of properties file
	 * @return , returns the file path of the specified properties file
	 */
	public String getConfigFilePath(String File) {
		String configFilePath;
		// configFilePath =
		// getConfigFolderPath()+fileSeperator+File.toLowerCase()+".properties";
		configFilePath = getConfigFolderPath() + fileSeperator + File + ".properties";
		return configFilePath;
	}

	/**
	 * 
	 * This method is used to get the location of 'ConfigFiles' folder
	 *
	 * @return, Returns the path of 'ConfigFiles' folder
	 */
	public String getConfigFolderPath() {
		return System.getProperty("user.dir") + fileSeperator + "ConfigFiles";
	}

	/**
	 * This method helps to write any new key value pairs to properties file.
	 * 
	 * @param sKey
	 * @param sData
	 */
	

}
