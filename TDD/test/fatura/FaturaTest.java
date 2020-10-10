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
		
	}
}
