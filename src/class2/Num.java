package class2;
import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        System.out.println("This program cheaks which number is greater");
        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        // no need of second class its optional and sc is getting the val
     //   Scanner val2 = new Scanner(System.in);
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("--- The first digit is bigger ---");
        } else {
            System.out.println("--- The second digit is bigger ---");
        }
        sc.close();

    }

}
