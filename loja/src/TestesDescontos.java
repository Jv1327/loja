import Desconto.CalculadoraDeDescontos;
import orcamento.ItemOrcamento;
import orcamento.Orcamento;
import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento();
        primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

        Orcamento segundo = new Orcamento();
        segundo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

        Orcamento terceiro = new Orcamento();
        terceiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
        System.out.println(calculadora.calcular(terceiro));
    }

}