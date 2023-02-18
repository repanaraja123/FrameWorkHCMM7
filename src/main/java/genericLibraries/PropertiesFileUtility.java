package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

   /**
    * This class contains all reusable methods to perform operations on properties
    * @author Ramanjaneyulu
    *
    */
   
   public class PropertiesFileUtility {
	   private Properties property;
	     /**
	      * this method is used to initialize properties file
	      * @Paramfilepath
	      */
     	public void propertyFileInitailization(String filePath) {
	    	FileInputStream fis = null;
		      try {
		    	fis = new FileInputStream(filePath);
		           }catch(FileNotFoundException e) {
			       e.printStackTrace();
		         }
	       	property = new Properties();
		      try {
			      property.load(fis);
		        }catch(IOException e) {
			      e.printStackTrace();
		           }
		
	       }
	       /**
	        * This method returns the data from properties file based on the key passed 
	        * @Param key
	        * @return
	        */
	
        	public String fetchProperty(String key) {
		     return property.getProperty(key);
	          }

        }
