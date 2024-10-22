package pedido.acao;

import pedido.Pedido;

public class SalvarPedidonoBancoDeDados implements AcaoAposGerarPedido{
    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando Pedido no Banco de Dados");
    }
}
