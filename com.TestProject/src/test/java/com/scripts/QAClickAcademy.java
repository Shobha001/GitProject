package com.scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class QAClickAcademy {

	private WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		// change it to if browser name is this and so and so
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-shobku\\Desktop\\Personal\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.manage().window().maximize();
	}
	
	@Test
	public void webTable() {
		WebElement webtable = driver.findElement(By.xpath("//table[@id='product']/tbody"));
		
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		System.out.println("Number of rows are " + rows.size());
		
		List<WebElement> columns = webtable.findElements(By.tagName("th"));
		System.out.println("Number of cloumns are " + columns.size());
		
		
		
		/*
		 * List<WebElement> webtable =
		 * driver.findElements(By.xpath("//table[@id='product']"));
		 * System.out.println("webtable value is " + webtable);
		 * 
		 * for(WebElement ele: webtable) {
		 * 
		 * String tableValue = ele.getText(); System.out.println(tableValue);
		 * System.out.println("rows and columns are " + ele);
		 * 
		 * }
		 */
		
		
		
		  
		  
		  //for (int rnum = 0; rnum < rows.size(); rnum++)}
		  
		  
		  /*for (int cnum = 0; cnum < columns.size(); cnum++) {
		  System.out.println(columns.get(cnum).getText()); } }*/
		 
		  }
	
	
	
	
	
	
	
	 
		
		
	
		
	/*
	 * @Test public void alertExample() throws InterruptedException { WebElement
	 * alertBox = driver.findElement(By.id("name")); alertBox.click();
	 * alertBox.sendKeys("Shobha"); driver.findElement(By.id("confirmbtn")).click();
	 * Alert alert = driver.switchTo().alert(); alert.accept();
	 * 
	 * }
	 */
	
	//best practices
		//WebElement cheese = driver.findElement(By.id("Cheese"));
		//WebElement chedar = cheese.findElement(By.id("Cheddar"));
		//driver.findElement(By.cssSelector("#cheese #cheddar"));
	
	/*
	 * @Test public void isElementDisplayed() { WebElement element =
	 * driver.findElement(By.id("displayed-text")); element.click(); assert
	 * element.isDisplayed(); WebElement isBoxHidden =
	 * driver.findElement(By.id("hide-textbox")); isBoxHidden.click(); assert
	 * isBoxHidden.isDisplayed(); System.out.println("Box is hidden currently");
	 * 
	 * 
	 * }
	 */
		
	

	
	
	  /*@Test public void checkBox() {
	  driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	  
	  }*/
	 
	
	//debug this test case
	/*
	 * @Test public void windowExample() {
	 * driver.findElement(By.xpath(".//button[@id='openwindow']")).click(); //String
	 * window = driver.getWindowHandle(); 
	 * assert driver.getWindowHandles().size()==1;
	 * 
	 * 
	 * }
	 */

	/*
	 * @Test public void clickRadioButton() { // convert this to list of web
	 * elements and try changing the code
	 * driver.findElement(By.xpath("//label[@for='radio1']/input")).click();
	 * System.out.println("Radio button is selected"); }
	 * 
	 * @Test public void suggestionClass() {
	 * driver.findElement(By.id("autocomplete")).click();
	 * System.out.println("suggestion box is selected"); }
	 * 
	 * @Test public void dropDown() { WebElement dropDown =
	 * driver.findElement(By.id("dropdown-class-example")); dropDown.click(); Select
	 * select = new Select(dropDown); select.selectByValue("option2");
	 * System.out.println("dropdown is selected");
	 * 
	 * }
	 */

	@BeforeTest
	public void test() {

	}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	/*
	 * if(driver="Chrome") {
	 * 
	 * }
	 */

}
