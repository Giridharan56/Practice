 package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://www.instagram.com/");
		//d.navigate().refresh();
		Thread.sleep(3000);
		
		d.quit();
		
	}

}
