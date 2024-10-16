package MinhaPrimeiraAutomacao;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomacaoAdvantageOnlineShop {

	
	WebDriver navegador;
	
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		navegador = new ChromeDriver();
		navegador.get("https://www.advantageonlineshopping.com/#/");
		navegador.manage().window().maximize();
		Thread.sleep(4000);
		navegador.findElement(By.id("menuUser")).click();
		navegador.findElement(By.name("username")).sendKeys("Riralli01");
		Thread.sleep(3000);
		navegador.findElement(By.name("password")).sendKeys("153947Rd");
		navegador.findElement(By.id("sign_in_btn")).click();
		navegador.quit();
		}

	@After
	public void tearDown() throws Exception {
		
		
	}

	
	
	
	
	@Test
	public void test() {
//		fail("Not yet implemented");
	}

}