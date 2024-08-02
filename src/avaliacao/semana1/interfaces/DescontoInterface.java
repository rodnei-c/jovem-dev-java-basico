package avaliacao.semana1.interfaces;

import avaliacao.semana1.classes.Venda;

@FunctionalInterface
public interface DescontoInterface {
	double calculaDesconto(double valor1, int valor2);
}
