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


        System.out.println("Quantos gol o " + time1 + " fez?");
        int golsTime1 = teclado.nextInt();

        System.out.println("Quantos gol o " + time2 + " fez?");
        int golsTime2 = teclado.nextInt();

        System.out.println("Quantos gol o " + time3 + " fez?");
        int golsTime3 = teclado.nextInt();

        System.out.println("Quantos gol o " + time4 + " fez?");
        int golsTime4 = teclado.nextInt();

        System.out.println("Primeiro jogo de Quarta de final: " + time1 + " x " + time2);
        if (golsTime1 >= golsTime2){
            System.out.println("O time " + time1 + " sera o mandate do jogo pois fez um total de: " + golsTime1 + " gols");
        }else {
            System.out.println("O time " + time2 + " sera o mandate do jogo pois fez um total de: " + golsTime2 + " gols");

        }

        System.out.println("segundo jogo de Quarta de final: " + time3 + " x " + time4);
        if (golsTime3 >= golsTime4){
            System.out.println("O time " + time3 + " sera o mandate do jogo pois fez um total de: " + golsTime3 + " gols");
        }else {
            System.out.println("O time " + time4 + " sera o mandate do jogo pois fez um total de: " + golsTime4 + " gols");
        }
    }
}