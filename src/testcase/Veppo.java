package testcase;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Veppo {
	WebDriver driver;
	
	@Before
	public void iniciar() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.veppocel.com.br/internet/php/cadastro.php");
		driver.manage().window().maximize();
	}

	@Test
	public void test()throws InterruptedException {
		
		//capturando o elemento do campo nome completo
		Thread.sleep(2000);
		WebElement txtNome = driver.findElement(By.name("nome"));
		txtNome.sendKeys("Juliana Juliana");
		
		//capturando o elemento do campo endereço
		Thread.sleep(2000);
		WebElement txtEndereco = driver.findElement(By.name("endereco"));
		txtEndereco.sendKeys("Av. Venâncio Aires, 93");
		
		//capturando o elemento do campo complemento
		Thread.sleep(2000);
		WebElement txtComplemento = driver.findElement(By.name("complemento"));
		txtComplemento.sendKeys("Escola técnica");
		
		//capturando o elemento do campo cidade
		Thread.sleep(2000);
		WebElement txtCidade = driver.findElement(By.name("cidade"));
		txtCidade.sendKeys("Porto Alegre");
		
		//capturando o elemento do campo bairro
		Thread.sleep(2000);
		WebElement txtBairro = driver.findElement(By.name("bairro"));
		txtBairro.sendKeys("Cidade Baixa");

		//capturando o elemento do campo CEP
		Thread.sleep(2000);
		WebElement txtCEP = driver.findElement(By.name("cep"));
		txtCEP.sendKeys("90040191");
		
		//capturando o elemento do campo estado
		Thread.sleep(2000);
		WebElement selEstado = driver.findElement(By.name("uf"));
		selEstado.sendKeys("Acre");
		selEstado.sendKeys(Keys.DOWN);
		selEstado.sendKeys(Keys.DOWN);
		selEstado.sendKeys(Keys.DOWN);
		selEstado.sendKeys(Keys.DOWN);
		selEstado.sendKeys(Keys.DOWN);
		selEstado.sendKeys(Keys.DOWN);
		selEstado.sendKeys(Keys.DOWN);
		selEstado.sendKeys(Keys.DOWN);
		selEstado.sendKeys(Keys.DOWN);
		selEstado.sendKeys(Keys.DOWN);
		selEstado.sendKeys(Keys.DOWN);
		selEstado.sendKeys(Keys.DOWN);
		selEstado.sendKeys(Keys.DOWN);
		selEstado.sendKeys(Keys.DOWN);
		selEstado.sendKeys(Keys.DOWN);
		selEstado.sendKeys(Keys.DOWN);
		selEstado.sendKeys(Keys.DOWN);
		selEstado.sendKeys(Keys.DOWN);
		selEstado.sendKeys(Keys.DOWN);
		selEstado.sendKeys(Keys.DOWN);
		selEstado.sendKeys(Keys.ENTER);
		
		//capturando o elemento do campo pessoa
		Thread.sleep(2000);
		WebElement rdPessoa = driver.findElement(By.xpath("/html/body/center/table/tbody/tr/td/form/table/tbody/tr[8]/td[2]/input[2]"));
		rdPessoa.click();
		
		//capturando o elemento do campo CPF
		Thread.sleep(2000);
		WebElement txtcpf = driver.findElement(By.name("cpfcgc"));
	    txtcpf.sendKeys("10010010011");

	    //capturando o elemento do campo telefone
	    Thread.sleep(2000);
	    WebElement txttelefone = driver.findElement(By.name("fone"));
	    txttelefone.sendKeys("51912345678");
	    
	    //capturando o elemento do campo fax
	    Thread.sleep(2000);
	    WebElement txtfax = driver.findElement(By.name("fax"));
	    txtfax.sendKeys("544445444");
	   
	    //capturando o elemento do campo celular
	    Thread.sleep(2000);
	    WebElement txtcelular = driver.findElement(By.name("celular"));
	    txtcelular.sendKeys("554544546");
	    
	    //capturando o elemento do campo email
	    Thread.sleep(2000);
	    WebElement txtemail = driver.findElement(By.name("email"));
	    txtemail.sendKeys("jasperjasper@gmail.com");
	    
	    //capturando o elemento do campo senha
	    Thread.sleep(2000);
	    WebElement txtsenha = driver.findElement(By.name("senha"));
	    txtsenha.sendKeys("12345");
	    
	  //capturando o elemento do campo confirmar senha
	    Thread.sleep(2000);
	    WebElement txtpass1 = driver.findElement(By.name("pass1"));
	    txtpass1.sendKeys("12345");
	    
	    Thread.sleep(2000);
	    WebElement btnLimpar = driver.findElement(By.name("btnAux"));
	    btnLimpar.click();
		
	}

}
