package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	private Properties properties;
	private final String PropertiesFilePath = "config//Configuration.properties";
	
	public ConfigFileReader(){
		BufferedReader dr;
		try {
			 dr = new BufferedReader(new FileReader(PropertiesFilePath));
			 properties = new Properties();
			 properties.load(dr);
			 dr.close();
			 
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("configuration.Properties file not found at the location");
		}

	}

    public String getFilePath()
    {
    	String filePath = properties.getProperty("FilePath");
    	if(filePath!=null)
    	{
    		return filePath;
    	}
    	
    	else
    		{
    		throw new RuntimeException("FilePath is not present in the properties file");
    		}
    }

    
    public String getURL()
    {
    	String URL = properties.getProperty("URL");
    	if(URL!=null) return URL;
    	else throw new RuntimeException("URL is not present in the properties file");
    	
    }

    public int getImpliciteWait()
    {
    String wait = properties.getProperty("Implicitywait");
    
    int implicitewait = Integer.parseInt(wait);
    
    if(wait!=null) return implicitewait;
    else throw new RuntimeException("The Implicite Wait vale is not present in the properties file");
    }

    public String getUID()
    {
    	String Uid = properties.getProperty("UserID");
    	if(Uid!=null) return Uid;
    	else throw new RuntimeException("User id not present in the properties file");
    }

    public String getUpwd()
    {
    	String Pwd = properties.getProperty("Pwd");
    	if(Pwd!=null) return Pwd;
    	else throw new RuntimeException("pwd is not present in the properties file");
    }

}
