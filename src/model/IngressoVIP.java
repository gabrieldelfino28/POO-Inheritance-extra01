package model;

public class IngressoVIP extends Ingresso {
    private String funcao;

    public IngressoVIP() {
        super();
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public float valorTotal(float valorTaxa) {
        return (getValor() + (getValor() * valorTaxa)) * 1.18f;
    }
}
