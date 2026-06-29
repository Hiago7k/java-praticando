import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        // Copa Do mundo 2026

        Scanner teclado = new Scanner(System.in);

        System.out.println("|********************************|");
        System.out.println("|------ Copa do mundo 2026 ------|");
        System.out.println("|********************************|");

        System.out.println("Digite o primeiro time que passou para as oitivas de final: ");
        String time1 = teclado.next();
        System.out.println("Digite o segundo time que passou para as oitivas de final: ");
        String time2 = teclado.next();
        System.out.println("Digite o terceiro time que passou para as oitivas de final: ");
        String time3 = teclado.next();
        System.out.println("Digite o quarto time que passou para as oitivas de final: ");
        String time4 = teclado.next();

        System.out.println("Os times classificados foram: ");
        System.out.println("- " + time1 + " -" + "- " + time2 + " -" + "- " + time3 + " -" + "- " + time4 + " -");
        
    }
}