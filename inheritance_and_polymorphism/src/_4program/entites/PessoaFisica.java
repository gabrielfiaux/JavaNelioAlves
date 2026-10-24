package _4program.entites;

public class PessoaFisica extends Pessoa {
    //Os dados de pessoa física são: nome, renda anual e gastos com saúde.
    /*
    Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
    renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50%
    destes gastos são abatidos no imposto.
    Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto
    fica: (50000 * 25%) -(2000 * 50%) = 11500.00
     */
    Double gastoComSaude;

    public PessoaFisica(String nome, Double rendaAnual, Double gastoComSaude) {
        super(nome, rendaAnual);
        this.gastoComSaude = gastoComSaude;
    }

    public Double getGastoComSaude() {
        return gastoComSaude;
    }

    public void setGastoComSaude(Double gastoComSaude) {
        this.gastoComSaude = gastoComSaude;
    }

    /*
      Pessoa física: pessoas cuja renda foi abaixo de 20,000.00 pagam 15% de imposto. Pessoas com
    renda de 20,000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50%
    destes gastos são abatidos no imposto.
     */
    @Override
    public Double impostoAPagar() {
        if (rendaAnual >= 20000) {
            if (getGastoComSaude() > 0) {
                return (rendaAnual * 0.25) / 2;
            }
            return (rendaAnual * 0.25);
        }
        if (gastoComSaude > 0) {
            return (rendaAnual * 0.15) / 2;
        }
        return rendaAnual * 0.15;
    }

    @Override
    public String sumarioDeImposto() {
        return getNome() + ": $ " + impostoAPagar();
    }
}
