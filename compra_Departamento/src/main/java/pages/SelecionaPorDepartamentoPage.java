package pages;

import org.junit.Assert;
import org.junit.Test;

import base.BaseTest;
import selector.SelectorPorDepartamento;

public class SelecionaPorDepartamentoPage extends BaseTest {
	SelectorPorDepartamento elements = new SelectorPorDepartamento();

	@Test
	public void selecionaTerceiroDepartamento() {
		
		mouseEnterFlex(elements.abaTodosDepartamentos, elements.artigosParaFesta);
		escolherProdutoNalistagem(elements.objetoIndexTres);

	}
	/*public void selecionaTerceiroProduto() {
		escolherProdutoNalistagem(elements.objetoIndexTres);
	}*/
	
	

}
