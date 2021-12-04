package DynamicsXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonPrice {
	public static void main(String[] args) {
		
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=phones&ref=nb_sb_noss_2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Samsung Galaxy M32 5G (Sky Blue, 6GB RAM, 128GB Storage)']/ancestor::div[@class='sg-row']/descendant::span[@class='a-price']"));
		System.out.println(ele.getText());
		
	}

}
