import java.util.Scanner;

public class Main {

    public static void desen(int number) {
int number2=number;int i=-1;
   if(number>-9990&&number>(i*5)) {
       System.out.println(number);
       desen(number - 5);
       i++;if(number>0){
System.out.println(number2);}
   }





       }



    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int value;
        System.out.println("Please enter a value:");
        value= scanner.nextInt();
        desen(value);
    }
}