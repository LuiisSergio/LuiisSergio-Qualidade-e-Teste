package pagamento;

import java.util.Date;

public class Pagamento {
	
	private int codigoBoleto;
	private Date data;
	private double valorPago;
	private String tipoDePagamento;
	
	public Pagamento(int cod, double valor, String tipo) {
		data = new Date();
		valorPago = valor;
		codigoBoleto = cod;
		tipoDePagamento = tipo;
	}
	public double getValorPago() {
		return valorPago;
	}
}
