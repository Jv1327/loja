package imposto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS extends Imposto{

    public ISS(Imposto outro) {
        super(outro);
    }

    public BigDecimal realizarCalculo(Orcamento orcamento) {

        return orcamento.getValor().multiply(new BigDecimal(0.6));
    }
}
