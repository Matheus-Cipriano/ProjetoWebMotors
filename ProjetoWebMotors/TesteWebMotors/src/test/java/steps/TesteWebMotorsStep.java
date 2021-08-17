package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.Anuncio;
import pages.FerramentaFIPE;
import pages.InfoCarro;
import pages.MarcaEModelo;
import pages.MensagemVendedor;
import pages.ValidacaoBotao;
import pages.ValidacaoPreco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.pt.*;


public class TesteWebMotorsStep {
	private WebDriver navegador;

	@Dado("que estou no site")
	public void queEstouNoSite() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sempre IT\\eclipse-workspace\\TesteWebMotors\\src\\test\\resources\\Driver\\chromedriver.exe");
		navegador = new ChromeDriver();
		navegador.get("https://www.webmotors.com.br");
		navegador.manage().window().maximize();
		//String winHandleBefore = navegador.getWindowHandle();

	}

	@Quando("entro na ferramenta Tabela FIPE")
	public void entroNaFerramentaTabelaFipe() throws InterruptedException {
		FerramentaFIPE ferramentafipe = new FerramentaFIPE(navegador);
		ferramentafipe.entroNaFerramentaTabelaFipe();

	}

	@Quando("escolho uma marca e um modelo")
	public void escolhoUmaMarcaEUmModelo() throws InterruptedException {
		MarcaEModelo marcaemodelo = new MarcaEModelo(navegador);
		marcaemodelo.escolhoUmaMarcaEUmModelo();

	}

	@Entao("valido se o preco foi dado")
	public void validoSeOPrecoFoiDado() throws InterruptedException {
		ValidacaoPreco validacaopreco = new ValidacaoPreco(navegador);
		validacaopreco.validoSeOPrecoFoiDado();

	}

	@Dado("estou na ferramenta tabela FIPE")
	public void estouNaFerramentaTabelaFipe() throws InterruptedException {
		InfoCarro infocarro = new InfoCarro(navegador);
		infocarro.estouNaFerramentaTabelaFipe();

	}

	@Quando("seleciono um anuncio")
	public void selecionoUmAnuncio() throws InterruptedException {
		Anuncio anuncio = new Anuncio(navegador);
		anuncio.selecionoUmAnuncio();

	}

	@Quando("envio uma mensagem")
	public void envioUmaMensagem() throws InterruptedException {
		MensagemVendedor mensagemvendedor = new MensagemVendedor(navegador);
		mensagemvendedor.envioUmaMensagem();

	}

	@Entao("valido se o botao e clicavel")
	public void validoSeOBotaoEClicavel() throws InterruptedException {
		ValidacaoBotao validacaobotao = new ValidacaoBotao(navegador);
		WebElement botao = navegador.findElement(By.xpath("(//button[@id='ButtonSendProposal'])[2]"));
		validacaobotao.validoSeOBotaoEClicavel(botao);
		navegador.quit();
	}

}
