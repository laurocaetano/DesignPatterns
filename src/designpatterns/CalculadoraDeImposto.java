package designpatterns;

public class CalculadoraDeImposto {

	public double calcula(Orcamento orcamento, Imposto imposto) {
		return imposto.calcula(orcamento);
	}
}
