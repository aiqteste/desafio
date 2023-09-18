package base;

import org.junit.After;
import org.junit.Before;

public class BaseTest extends BasePage{
	@Before
	public void inicializa() {
		getDriver().get("https://www.magazineluiza.com.br/");
	}
	@After
	public void finaliza() {
		//getDriver().quit();
	}
}
