import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String saida = "S"; // VARIAVEL DE SAIDA DO LAÇO

        while(saida.equals("S") == true){ // ENQUANTO A SAIDA FOR IGUAL A "S" CONTINUA NO LAÇO
            //chamada das classes
            TesteNUM num = new TesteNUM();
            TesteSN sn = new TesteSN();

            num.parImpar(); //chamando o metodo testarNum da class TESTENUM
            System.out.println("Deseja continuar: (S/N) ");
            sn.testarSN(); //Chamando o metodo testarSN da class TESTESN para retornar sempre "S" /"N" /"F"
            saida = sn.saida;

            while(saida.equals("F") == true){
                System.out.println("Valor invalido (S/N): ");
                sn.testarSN();
                saida = sn.saida;
            }
            if (saida.equals("N") == true){
                break; // saindo do loop se nesse momento a saida for "N"
            }
        }
    }
}