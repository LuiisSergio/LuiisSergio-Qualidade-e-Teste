package fatura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import pagamento.Pagamento;

@DisplayName("Classe para teste da fatura")
public class FaturaTest {
	
	private Fatura fatura;
	
	@Test
	public void testFatura1() {
		fatura = new Fatura("Luis Sergio", 1500);
		assertEquals(fatura.getNomeCliente(), "Luis Sergio");
		Pagamento boleto1 = new Pagamento(1, 500, "BOLETO");
		fatura.addPagamento(boleto1);
		assertEquals(fatura.getFaltaPagar(), 1000);
		
		Pagamento boleto2 = new Pagamento(2, 400, "BOLETO");
		fatura.addPagamento(boleto2);
		assertEquals(fatura.getFaltaPagar(), 600);
		
		Pagamento boleto3 = new Pagamento(3, 600, "BOLETO");
		fatura.addPagamento(boleto3);
		assertEquals(fatura.getFaltaPagar(), 0);
		assertEquals(fatura.isPago(), true);
		
	}
	@Test
	public void testFatura2() {
		fatura = new Fatura("Luis", 1500);
		
		Pagamento boleto1 = new Pagamento(1, 1000, "BOLETO");
		fatura.addPagamento(boleto1);
		assertEquals(fatura.getFaltaPagar(), 500);
		assertEquals(fatura.isPago(), false);
					
		Pagamento boleto2 = new Pagamento(2, 500, "BOLETO");
		fatura.addPagamento(boleto2);
		assertEquals(fatura.getFaltaPagar(), 0);
		assertEquals(fatura.isPago(), true);
					
		Pagamento boleto3 = new Pagamento(3, 250, "BOLETO");
		fatura.addPagamento(boleto3);
		assertEquals(fatura.getFaltaPagar(), 0);
		assertEquals(fatura.isPago(), true);
	}
	@Test
	public void testFatura3() {
		fatura = new Fatura("Sergio", 2000);
		
		Pagamento boleto1 = new Pagamento(1, 500, "BOLETO");
		fatura.addPagamento(boleto1);
		assertEquals(fatura.getFaltaPagar(), 1500);
		assertEquals(fatura.isPago(), false);
					
		Pagamento boleto2 = new Pagamento(2, 400, "BOLETO");
		fatura.addPagamento(boleto2);
		assertEquals(fatura.getFaltaPagar(), 1100);
		assertEquals(fatura.isPago(), false);
					
	}
}
