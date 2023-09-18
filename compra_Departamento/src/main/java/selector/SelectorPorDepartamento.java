package selector;
import org.openqa.selenium.By;

import base.BasePage;

public class SelectorPorDepartamento {
  public By abaTodosDepartamentos = By.xpath("//a[contains(text(),'Todos os departamentos')]");
  public By artigosParaFesta = By.xpath("//nav[@data-testid='header-menu-footer-elem']/..//li[.='Artigos para Festa']");
  public By objetoIndexTres = By.cssSelector("#__next > div > main > section:nth-child(5) > div.sc-dcJsrY.hmLryf > div > ul");
  public By valorDoObjetoIndexTres = By.cssSelector("div#__next > div > main > section:nth-of-type(4) > div:nth-of-type(4) > div > ul > li:nth-of-type(3) > a > div:nth-of-type(3) > h2");
  public By bttnAdicionarSacola = By.xpath("//label[contains(text(),'Comprar Agora')]");
}
