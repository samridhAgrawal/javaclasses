package class2;
import java.util.Scanner;

public class NumTwo {
    public static void main(String[] args){
        System.out.println("This program cheaks which number is greater");
        System.out.println("Enter the first number");
        Scanner val1 = new Scanner(System.in);
        int a = val1.nextInt();
        System.out.println("Enter the second number");
        Scanner val2 = new Scanner(System.in);
        int b = val2.nextInt();
        System.out.println("Enter the third number");
        Scanner val3 = new Scanner(System.in);
        int c = val3.nextInt();
        if(a>b && a>c){
            System.out.println("--- The first digit is biggest ---");
        }
        else if(b>a && b>c){
            System.out.println("--- The second digit digit is biggest ---");
        }
        else{
            System.out.println("--- The Third digit digit is biggest ---");

        }
    }
}