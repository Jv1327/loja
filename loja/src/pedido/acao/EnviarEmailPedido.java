package pedido.acao;

import pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{
    public void executarAcao(Pedido pedido) {
        System.out.println("Enviando Email com dados do Pedido");
    }
}
