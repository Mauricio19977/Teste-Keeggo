package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String site) {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	public void clicar(By elemento) {

		driver.findElement(elemento).click();
		
	}

	public void pausa(int tempo) throws InterruptedException {
		Thread.sleep(tempo);

	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}
	
	public void validacao(String texto, By elemento) {
		String txt = driver.findElement(elemento).getText();
		assertEquals(texto, txt);		
	}

	public void ScreenShot (String nomeScr) throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Evidencias/" + nomeScr + ".png");
		FileUtils.copyFile(scrFile, destFile);
	}
	
	public void fecharNavegador() {
		
		driver.quit();
	}
}
