package _4program.entites;

public abstract class Pessoa {
    String nome;
    Double rendaAnual;

    public Pessoa(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public String sumarioDeImposto() {
        return getNome() + ": $ " + String.format("%.2f", impostoAPagar());
    }

    public abstract Double impostoAPagar();
}
