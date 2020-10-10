package fatura;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pagamento.Pagamento;

public class processadorDePagamentosTest {
	
	private Fatura fatura;
	private static ArrayList<Pagamento> pagamentos;
	@BeforeEach
	public void inicializaTodos() {
		pagamentos = new ArrayList<Pagamento>();
	}
			
	@Test
	public void testFatura1() {
		fatura = new Fatura("Luis Sergio", 1500);
		pagamentos.add(new Pagamento(1, 500, "BOLETO"));
		pagamentos.add(new Pagamento(2, 400, "BOLETO"));
		pagamentos.add(new Pagamento(3, 600, "BOLETO"));
		fatura.addArrayPagamento(pagamentos);
		assertEquals(fatura.getFaltaPagar(), 0);
		assertEquals(fatura.isPago(), true);
	}
	
	@Test
	public void testFatura2() {
		fatura = new Fatura("Luis", 1500);
		pagamentos.add(new Pagamento(1, 1000, "BOLETO"));
		pagamentos.add(new Pagamento(2, 500, "BOLETO"));
		pagamentos.add(new Pagamento(3, 250, "BOLETO"));
		fatura.addArrayPagamento(pagamentos);
		assertEquals(fatura.getFaltaPagar(), 0);
		assertEquals(fatura.isPago(), true);
	}
	
	@Test
	public void testFatura3() {
		fatura = new Fatura("Sergio", 2000);
		pagamentos.add(new Pagamento(1, 500, "BOLETO"));
		pagamentos.add(new Pagamento(2, 400, "BOLETO"));
		assertEquals(fatura.getFaltaPagar(), 2000);
		assertEquals(fatura.isPago(), false);
	}

}
