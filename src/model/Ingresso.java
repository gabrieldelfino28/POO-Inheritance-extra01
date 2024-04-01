package model;

public class Ingresso {
    private String identificacao;
    private float valor;

    public Ingresso(){
        super();
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float valorTotal(float valorTaxa) {
        return this.valor + (this.valor*valorTaxa);
    }
}
