package com.DemoWebShop.genericlibraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyfile {

	public static void main(String[] args) throws IOException {
		File file=new File ("./src/test/resources/PropertiesFile/ConfigureProperty");
				FileInputStream fis=new FileInputStream(file);
		Properties  prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		
		
	}

}
