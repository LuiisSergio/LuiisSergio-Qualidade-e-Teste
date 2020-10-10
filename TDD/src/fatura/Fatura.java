package fatura;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import pagamento.Pagamento;

public class Fatura {
	private ArrayList<Pagamento> pagamento;
	private String nomeCliente;
	private Date data;
	private double valorTotal;
	private boolean pago;
	
	public Fatura(String nome, int valor) {
		setNomeCliente(nome);
		valorTotal = valor;
		pagamento = new ArrayList<Pagamento>();
	}
	
	public double getValorPago() {
		double valorPago = 0.0;
		for (Iterator<Pagamento> i = pagamento.iterator(); i.hasNext();) {
			Pagamento pagamento = i.next();
			valorPago += pagamento.getValorPago();
		}
		return valorPago;
	}
	public boolean isPago(){
		if(pago == false) pago = getFaltaPagar() <= 0 ? true:false;
		return pago;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public double getFaltaPagar() {
		double valor =  getValorTotal() - getValorPago();
		return valor > 0 ? valor : 0;
	}
	public void addPagamento(Pagamento pagamentoEfetuado) {
		pagamento.add(pagamentoEfetuado);
	}
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
}
