package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;


public class ValidacaoBotao {
	private WebDriver navegador;

	// Construct
	public ValidacaoBotao(WebDriver navegador) {
		this.navegador = navegador;
	}

	public boolean isClickable(WebElement btn) {
		try {
			WebDriverWait wait = new WebDriverWait(navegador, 10);
			wait.until(ExpectedConditions.elementToBeClickable(btn));
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}       

	public void validoSeOBotaoEClicavel(WebElement botao) throws InterruptedException {
		Thread.sleep(3000);
		boolean valido = isClickable(botao);
		Assert.assertTrue(valido);
		
}
}