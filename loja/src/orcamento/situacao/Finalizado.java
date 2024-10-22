package orcamento.situacao;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class Finalizado extends SituacaoOrcamento{

    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        throw new DomainException("Orcamento finalizado nao pode ter desconto extra!");
    }
}
