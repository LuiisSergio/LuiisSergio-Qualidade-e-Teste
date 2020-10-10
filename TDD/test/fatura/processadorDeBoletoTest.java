package fatura;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pagamento.Pagamento;

public class processadorDeBoletoTest {
	private Fatura fatura;
	private static ArrayList<Pagamento> pagamentos;
	@BeforeEach
	public static void inicializaTodos() {
		pagamentos = new ArrayList<Pagamento>();
	}
	
	@Test
	public void testFatura1() {
		fatura = new Fatura("Luis Sergio", 1500);
		pagamentos.add(new Pagamento(1, 500, "BOLETO"));
		pagamentos.add(new Pagamento(2, 400, "BOLETO"));
		pagamentos.add(new Pagamento(3, 600, "BOLETO"));
		fatura.addArrayPagamento(pagamentos);
		assertEquals(fatura.getFaltaPagar(), 10);
		assertEquals(fatura.isPago(), true);
	}
	

}
