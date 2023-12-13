package prop.read.write;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class PropertyFile {

	public static void readFile() {
		try {
		FileReader read = new FileReader("C:\\Users\\Mumi17\\ProjectClass\\NovProject1\\src\\test\\resources\\TestData\\Sample.properties");
		
		Properties prop = new Properties();
		prop.load(read);
		String user = prop.getProperty("Username");
		System.out.println(user);
		
		System.out.println(prop.getProperty("Password"));
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		}
	
	public static String readPropertyData(String key) throws Throwable{
		
		FileReader read = new FileReader("C:\\Users\\Mumi17\\ProjectClass\\NovProject1\\src\\test\\resources\\TestData\\Sample.properties");
		
		Properties prop = new Properties();
		prop.load(read);
		
		String value = prop.getProperty(key); //Username
		return value;
	}
	
	public static void writeFile() {
		try {
			FileWriter write = new FileWriter("C:\\Users\\Mumi17\\ProjectClass\\NovProject1\\src\\test\\resources\\TestData\\Sample.properties");
			
			Properties prop = new Properties();
			prop.setProperty("Batch", "Nov Project 1");
			prop.setProperty("Trainer", "Muthulakshmi");
			prop.store(write, "Muthulakshmi Nov 18");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	public static void main(String[] args) throws Throwable {
		//readFile();
		//String data = readPropertyData("Username");
		//System.out.println(data);
		writeFile();
	}
}
