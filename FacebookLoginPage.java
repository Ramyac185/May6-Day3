package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginPage {

	public static void main(String[] args) {
		//using Google Chrome
		ChromeDriver driver = new ChromeDriver();
		
		//using Microsoft Edge
		//EdgeDriver driver = new EdgeDriver();
		
		//using Firefox 
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/login");

	}

}
