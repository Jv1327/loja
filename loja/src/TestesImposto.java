import imposto.CalculadoraDeImpostos;
import imposto.ICMS;
import imposto.ISS;
import imposto.Imposto;
import orcamento.ItemOrcamento;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

        Imposto imposto = new ICMS(new ISS(null));
        System.out.println(imposto.calcular(orcamento));
    }
}
