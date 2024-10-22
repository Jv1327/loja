package orcamento;

import http.HttpAdapter;
import orcamento.situacao.DomainException;

import java.util.Map;

public class RegistroDeOrcamento {
    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }


    public void registrar(Orcamento orcamento) {
        if (orcamento.isFinalizado()) {
            throw new DomainException("Orcamento não Finalizado!");
        }
        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens()
        );
        http.post(url, dados);
    }
}
