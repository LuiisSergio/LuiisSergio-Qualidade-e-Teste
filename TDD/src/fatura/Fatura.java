package fatura;

import java.util.ArrayList;
import java.util.Date;

import pagamento.Pagamento;

public class Fatura {
	private ArrayList<Pagamento> pagamento;
	private String nomeCliente;
	private Date data;
	private double valorTotal;
	private boolean pago;
	
}
