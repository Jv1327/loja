import pedido.GeraPedidoHandler;
import pedido.GeraPedido;
import pedido.acao.EnviarEmailPedido;
import pedido.acao.LogDePedido;
import pedido.acao.SalvarPedidonoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

public class TestesPedidos {
    public static void main(String[] args) {
        String cliente = "Ana da Silva";
        BigDecimal valorOrcamento = new BigDecimal("745.99");
        int quantidadeItens = 3;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
                new EnviarEmailPedido(),
                new SalvarPedidonoBancoDeDados(),
                new LogDePedido()));
        handler.executar(gerador);
    }
}