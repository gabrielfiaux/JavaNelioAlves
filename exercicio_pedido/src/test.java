public class test {
    static void main() {
        String a = "10/20/3030";

        String dia = a.substring(0,2);
        String mes = a.substring(3,5);
        String ano = a.substring(6,10);
        int diaI = Integer.parseInt( dia);
        int mesI = Integer.parseInt( mes);
        int anoI = Integer.parseInt( ano);


        System.out.println(diaI);
        System.out.println(mesI);
        System.out.println(anoI);


















    }
}
