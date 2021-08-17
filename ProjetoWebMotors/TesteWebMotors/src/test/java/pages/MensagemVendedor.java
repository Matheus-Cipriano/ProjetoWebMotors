package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MensagemVendedor {
	private WebDriver navegador;

	// Construct
	public MensagemVendedor(WebDriver navegador) {
		this.navegador = navegador;
	}

	public void envioUmaMensagem() throws InterruptedException {
		for (String winHandle : navegador.getWindowHandles()) {
			navegador.switchTo().window(winHandle);
		}
		
		WebDriverWait wait = new WebDriverWait(navegador, 10);
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//button[contains(.,'Simular')]")));
		navegador.findElement(By.xpath("//button[contains(.,'Simular')]")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//button[@class='sc-htoDjs gtMZoW']")));
		navegador.findElement(By.xpath("//button[@class='sc-htoDjs gtMZoW']")).click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("(//input[@name='fullName'])[2]")));
		navegador.findElement(By.xpath("(//input[@name='fullName'])[2]")).sendKeys("Matheus Cipriano");
		navegador.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("matheusteste@sempreit.com.br");
		navegador.findElement(By.xpath("(//input[@name='numberPhone'])[2]")).sendKeys("11987654321");
		WebElement mensagem = navegador.findElement(By.xpath("//textarea[@name='message']"));	
		mensagem.clear();
		mensagem.sendKeys("Teste de contato com o vendedor");
		navegador.findElement(By.xpath("(//label[@class='Checkbox'])[2]")).click();
		System.out.println(mensagem.getText());
	}
}
