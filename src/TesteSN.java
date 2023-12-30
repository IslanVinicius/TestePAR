import java.util.Scanner;

public class TesteSN {
    Scanner scan = new Scanner(System.in);
    public String[] sSnN = {"S", "s", "n", "N"};
    public String saida;
    private int i = 0;

    public String testarSN() {
        if (i > 0) {
            i = 0;
        }
        saida = scan.nextLine();
        //System.out.println(i);
        while (saida.equals(sSnN[i]) == false) {
            i++;
            if (i > 3) {
                break;
            }
        }
        //System.out.println(i);
        switch (i) {
            case (0):
                return this.saida = "S";
            case (1):
                return this.saida = "S";
            case (2):
                return this.saida = "N";
            case (3):
                return this.saida = "N";
            default:
                return this.saida = "F";
        }
    }
}
