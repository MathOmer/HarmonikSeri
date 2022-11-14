import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double Number,result=0;
        double a=1;


        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        Number = input.nextDouble();
        
        for (double i=1;i<=Number;i++){
            a= 1/i;
            result +=a;
        }
        System.out.println(result);






    }
}