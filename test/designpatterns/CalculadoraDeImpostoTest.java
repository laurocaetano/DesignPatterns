package designpatterns;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraDeImpostoTest {

	private CalculadoraDeImposto calculadora;
	private Orcamento orcamento;

	@Before
	public void setUp() {
		calculadora = new CalculadoraDeImposto();
		orcamento = new Orcamento(500.00);
	}

	@Test
	public void deveRetornarCinquentaAoOrcamentoDeQuinhentosReaisComICMS() {
		Assert.assertEquals(50.0, calculadora.calcula(orcamento, new ICMS()));
	}

	@Test
	public void deveRetornarTrintaAoOrcamentoDeQuintentosReaisComISS() {
		Assert.assertEquals(30.0, calculadora.calcula(orcamento, new ISS()));
	}

}
