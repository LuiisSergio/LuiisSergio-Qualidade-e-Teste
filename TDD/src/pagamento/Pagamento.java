package pagamento;

import java.util.Date;

public class Pagamento {
	
	private int codigoBoleto;
	private Date data;
	private double valorPago;
	private String tipoDePagamento;
	
	public Pagamento(int cod, double valor, String tipo) {
		setData(new Date());
		valorPago = valor;
		codigoBoleto = cod;
		setTipoDePagamento(tipo);
	}
	public double getValorPago() {
		return valorPago;
	}
	public int getCodigoBoleto() {
		return codigoBoleto;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getTipoDePagamento() {
		return tipoDePagamento;
	}
	public void setTipoDePagamento(String tipoDePagamento) {
		this.tipoDePagamento = tipoDePagamento;
	}
}
