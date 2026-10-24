package _4program.entites;

public class PessoaJuridica extends Pessoa {
    //Os dados de pessoa jurídica são nome, renda anual e número de funcionários.
    /*

    Exemplo: uma  empresa  cuja  renda foi 400000.00 e possui 25 funcionários, o imposto fica:
    400000 * 14% = 56000.00
     */
    Integer numeroDeFuncionarios;

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFunionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFunionarios;
    }

    public Integer getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    /*
     Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
funcionários, ela paga 14% de imposto.
     */
    @Override
    public Double impostoAPagar() {
        if (numeroDeFuncionarios > 10) {
            return getRendaAnual() * 0.14;
        }
        return getRendaAnual() *0.16;
    }

    @Override
    public String sumarioDeImposto() {
        return super.sumarioDeImposto();
    }

}
