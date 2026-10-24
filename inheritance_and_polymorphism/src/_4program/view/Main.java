package _4program.view;

import _4program.entites.Pessoa;
import _4program.entites.PessoaFisica;
import _4program.entites.PessoaJuridica;

import java.util.Locale;

public class Main {
    /*
    Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais
podem ser pessoa física ou pessoa jurídica, == classes pessoas
 e depois mostrar o valor do imposto pago por cada um, == imposto por instancia
bem como o total de imposto arrecadado. ==Total de imposto
Os dados de pessoa física são: nome, renda anual e gastos com saúde.
Os dados de pessoa jurídica são nome, renda anual e número de funcionários.
 As regras para cálculo de imposto são as
seguintes:
Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50%
destes gastos são abatidos no imposto.
Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto
fica: (50000 * 25%) -(2000 * 50%) = 11500.00
Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
funcionários, ela paga 14% de imposto.
Exemplo: uma  empresa  cuja  renda foi 400000.00 e possui 25 funcionários, o imposto fica:
400000 * 14% = 56000.00
     */
    static void main(String[] args) {

        Pessoa p1 = new PessoaFisica("PFMaior com gasto em saude", 20000.0, 1.0);
        Pessoa p2 = new PessoaFisica("PFMaior sem gasto em saude", 20000.0, 0.0);
        Pessoa p3 = new PessoaFisica("PFMenor Com gasto em saude", 19999.0, 1.0);
        Pessoa p4 = new PessoaFisica("PFMenor sem gasto em saude", 19999.0, 0.0);
        System.out.println(p1.sumarioDeImposto());
        System.out.println(p2.sumarioDeImposto());
        System.out.println(p3.sumarioDeImposto());
        System.out.println(p4.sumarioDeImposto());
        System.out.println();
        Pessoa pj1 = new PessoaJuridica("PJ COM >10 F", 20.0, 11);
        Pessoa pj2 = new PessoaJuridica("PJ COM < 10 F", 20.0, 10);
        System.out.println(pj1.sumarioDeImposto());
        System.out.println(pj2.sumarioDeImposto());
    }
}
