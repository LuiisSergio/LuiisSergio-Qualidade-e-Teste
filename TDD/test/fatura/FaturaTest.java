package fatura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste da fatura")
public class FaturaTest {
	
	private Fatura fatura;
	
	@Test
	public void testFatura1() {
		fatura = new Fatura("Luis Sergio", 1500);
		assertEquals(fatura.getNomeCliente(), "Luis Sergio");
	}
}
