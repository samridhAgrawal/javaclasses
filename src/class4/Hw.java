package class4;

import java.util.Scanner;

public class Hw{
    public static void main(String[] args){
        hotOne();
        hotTwo();
        table();
    }
    private static void hotOne(){
        System.out.println(" -- All the even numbers from o to 10 ---");
        int i = 0;
        while(i < 11){
            System.out.println(i);
            i += 2;
        }
        System.out.println("-- All the ood num between 12 and 0 --");
        int a = 11;
        while (a > 0){
            System.out.println(a);
            a -= 2;
        }
        System.out.println("-- Sum of all the number from 1 to 10");
        int b = 1;
        int sum = 0;
        while (b <= 10){
            sum += b;
            b++;
        }
        System.out.println(sum);
    }
    private static void hotTwo(){
        System.out.println("finding the factorial of 5");
        int c = 5;
        int sum = 1;
        while (c > 0){
            sum *= c;
            c--;
        }
        System.out.println(sum);

    }
    private static void table(){
        System.out.println("Enter the number of the table u want");
        Scanner sc = new Scanner(System.in);
        int table = sc.nextInt();
        int i = 1;
        while (i <= 10){
            int sum = table * i;
            System.out.println(table + " x " + i + " = " + sum);
            i++;
        }
        sc.close();
    }
}

