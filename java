import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj N");
        int wart = input.nextInt();
        double[] tab;
        tab = new double[wart];
        for (int i = 0; i < wart; i++) {
            System.out.println("Podaj wartosc");
            Scanner x = new Scanner(System.in);
            double p = x.nextInt();
            tab[i] = p;


        }
        double zada = 0;
        for (int i = 0; i < wart; i++) {
            zada = zada + tab[i];
        }
        System.out.println("Podpunkt a dla tych liczb");
        System.out.println(zada);

        double zadb = 1;
        for (int i = 0; i < wart; i++) {
            zadb = zadb * tab[i];
        }
        System.out.println("Podpunkt b dla tych liczb");
        System.out.println(zadb);
        double zadc = 0;
        for (int i = 0; i < wart; i++) {
            zadc = zadc + Math.abs(tab[i]);
        }
        System.out.println("Podpunkt c dla tych liczb");
        System.out.println(zadc);
        double zadd = 0;
        for (int i = 0; i < wart; i++) {
            zadd = zadd + Math.sqrt(Math.abs(tab[i]));
        }
        System.out.println("Podpunkt d dla tych liczb");
        System.out.println(zadd);
        double zade = 1;
        for (int i = 0; i < wart; i++) {
            zade = zade * Math.abs(tab[i]);
        }
        System.out.println("Podpunkt e dla tych liczb");
        System.out.println(zade);
        double zadf = 0;
        for (int i = 0; i < wart; i++) {
            zadf = zadf + tab[i] * tab[i];
        }
        System.out.println("Podpunkt f dla tych liczb");
        System.out.println(zadf);
        double zadg1 = 0;
        double zadg2 = 1;
        for (int i = 0; i < wart; i++) {
            zadg1 = zadg1 + tab[i];
            zadg2 = zadg2 * tab[i];
        }
        System.out.println("Podpunkt g dla tych liczb");
        System.out.println(zadg1 + "oraz" + zadg2);
        double zadh = 0;
        for (int i = 0; i < wart; i++) {
            if(i == wart-2)
            {
                zadh = zadh + Math.pow(-1,i);
            } else if (i == wart-1) {
                zadh = zadh * tab[i];
            } else if (i % 2 ==0) {
                zadh = zadh + tab[i];
            } else{
                zadh = zadh - tab[i];
            }


        }
        System.out.println("Podpunkt h dla tych liczb");
        System.out.println(zadh);

    }
}

