package test;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	public static void main(String[] args) {

		List<String> people = new ArrayList<String>();
		people.add("shaked@gmail.com");
		people.add("alex@gmail.com.com");
		people.add("din@gmail.com");
		people.add("oren@gmail.com");
		people.add("or@gmail.com");

		printFilmAndRatio(people);

	}

	public static void printFilmAndRatio(List<String> people) {
		for (String p : people) {
			WebDriverManager.firefoxdriver().setup();
			WebDriver webDrive = new FirefoxDriver();
			webDrive.get("https://selenium-example.herokuapp.com/index.html");
			webDrive.findElement(By.xpath("/html/body/main/div/div/div/div[5]/div/div/div/div/button")).click();
			webDrive.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(p);
			webDrive.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1234");
			webDrive.findElement(By.xpath("//*[@id=\"login_btn\"]")).click();
			System.out.println("email: " + p + webDrive.getTitle() + " FILM IS " + " Ratio IS "
					+ webDrive.findElement(By.xpath(
							"//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[1]/div[1]/div[1]/strong/span"))
							.getText());
			webDrive.close();
		}

	}
}
