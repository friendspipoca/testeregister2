package pages;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	

	WebDriver drivers;

	public void abrirNavegador(String site) {
		System.setProperty("webdriver.chromedriver.drivers", "./drivers/chromedriver.exe");
		drivers = new ChromeDriver();
		drivers.get(site);
		drivers.manage().window().maximize();

	}

	public void clicar(By elemento) {
		try {
			drivers.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("-------- erro ao clicar -------- " + e.getMessage());
			System.err.println("-------- causa do erro -------- " + e.getCause());
		}
	}

	public void escrever(By elemento, String texto) {
		try {
			drivers.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("-------- erro ao escrever -------- " + e.getMessage());
			System.err.println("-------- causa do erro -------- " + e.getCause());
		}
	}

	public void fechar() {
		try {
			drivers.quit();
		} catch (Exception e) {
			System.err.println("-------- erro ao fechar browser -------- " + e.getMessage());
			System.err.println("-------- causa do erro -------- " + e.getCause());
		}
	}

	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
			drivers.getPageSource();

		} catch (Exception e) {
			System.err.println("-------- erro ao pausar com Thread.sleep -------- " + e.getMessage());
			System.err.println("-------- causa do erro -------- " + e.getCause());
		}
	}

	public void screnshot(String nome) throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) drivers);
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(scrFile, destFile);
	}

	public void validartexto(By elemento, String textoEsperado) {
		String textoCapturado = drivers.findElement(elemento).getText();
		assertTrue(textoCapturado.contains(textoEsperado));
	}
	
	public void mensagem () {
		System.out.println("Teste Passou!!!");

	    drivers.switchTo().window("/html/body/script[2]s");
	    drivers.close();
}
}

