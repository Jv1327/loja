import http.ApacheHttpAdapter;
import http.JavaHttpClient;
import orcamento.ItemOrcamento;
import orcamento.Orcamento;
import orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new ApacheHttpAdapter());
        registro.registrar(orcamento);
    }
}
