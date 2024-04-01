package view;

import model.Ingresso;
import model.IngressoVIP;

public class Main {

    public static void main(String[] args) {
        Ingresso i1 = new Ingresso();
        IngressoVIP i2 = new IngressoVIP();

        i1.setIdentificacao("1234-BC");
        i1.setValor(200);
        System.out.println("Ticket: " + "ID: " + i1.getIdentificacao() + ";valor Inicial: " + i1.getValor() + ";valor Final: " + i1.valorTotal(0.15f));

        i2.setIdentificacao("1764-AX");
        i2.setFuncao("Open Bar");
        i2.setValor(200);
        System.out.println("Ticket: " + "ID: " + i2.getIdentificacao() + ";valor Inicial: " + i2.getValor() + ";Funcao: " + i2.getFuncao() + ";valor Final: " + i2.valorTotal(0.15f));
    }
}
