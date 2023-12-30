import java.util.Scanner;
import java.util.Vector;

public class TesteNUM{

    //DECLARACAO DAS VARIAVEIS:
    public String num;
    private Scanner scan = new Scanner(System.in);
    private boolean validar;
    private int retorno;
    private int tamSTR;


    //CRIACAO DO METODO PARA TESTAR SE IMPAR OU PAR
    public void parImpar(){
        System.out.println("INFORME UM NUMERO: ");
        num = scan.nextLine(); //COLETANDO O NUMERO COMO UMA ISTRING PARA CASO O USUARIO DIGITE LETRAS
        tamSTR = num.length(); //COLETANDO O TAMANHO DA STRING
        if (num.substring(0, tamSTR).matches("[0-9]*")){ // TESTANDO COM O METODO SUBSTRING DA CLASSE STRING SE TAMANHO
            validar = true;                                     // DE 0 AO TAMANHO DA STRING HÁ SOMENTE NUMEROS, SE SIM RETORNAR TRUE
        }
        while (validar == false){
            System.out.println("INFORME UM NUMERO INTERIRO MAIOR 0: ");
            num = scan.nextLine();
            tamSTR = num.length();
            if (num.substring(0, tamSTR).matches("[0-9]*")){
                validar = true;
                retorno = Integer.parseInt(num);
            }
        }  // RECEBENDO STRING ATÉ VALIDAR FOR TRUE;

        if(Integer.parseInt(num) % 2 == 0){
            System.out.println("O NUMERO " + num + " É PAR");
        }else { // TESTANDO SE O NUM É IMPAR OU PAR
            System.out.println("O NUMERO " + num + " É IMPAR");
        }
    }
}
