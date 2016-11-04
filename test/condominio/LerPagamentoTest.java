package condominio;

import static org.junit.Assert.*;

import java.io.File;
import java.util.List;

import org.junit.Test;

import br.com.condominio.controllers.MoradorController;
import br.com.condominio.models.Pagamento;
import junit.framework.Assert;

public class LerPagamentoTest {

	@Test
	public void test() {
		File file = new java.io.File("teste.txt");
		MoradorController moradorController = new MoradorController();
		List<Pagamento> recebePagamentos =  moradorController.lerPagamento(file);
		Assert.assertNotNull(recebePagamentos);
	}

}
