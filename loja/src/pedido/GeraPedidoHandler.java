package pedido;

import orcamento.Orcamento;
import orcamento.ItemOrcamento;
import pedido.acao.AcaoAposGerarPedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {
    private List<AcaoAposGerarPedido> acoesAposGerarPedido;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoesAposGerarPedidos) {
        acoesAposGerarPedido = acoesAposGerarPedidos;
    }

    public void executar(GeraPedido geraPedido) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new Orcamento(new BigDecimal("200")));
        Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

        this.acoesAposGerarPedido.forEach(a -> a.executarAcao(pedido));
    }
}