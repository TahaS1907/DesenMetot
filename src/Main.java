import java.util.Scanner;

public class Main {
    public static void desen(int sayi) {
   int sayi2;
   Scanner scanner=new Scanner(System.in);
        if(sayi<=0){System.out.println(sayi);
            desen(sayi+5);
        }

       System.out.println(sayi);
       desen(sayi-5);


        System.out.println("Sayı giriniz sayı eşit olmalı en yüksek değer ile");
        sayi2= scanner.nextInt();
        if(sayi2==sayi){System.out.println(sayi2);}



       }


    public static void main(String[] args) {

        desen(15);
    }
}