import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        System.out.println("This is a calculator program");
        System.out.println("Type A for addition");
        System.out.println("Type S for subtraction");
        System.out.println("Type D for Division");
        System.out.println("Type M for multiplication");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if(Objects.equals(a, "A")){
            System.out.println("type the first digit:");
            Scanner addo = new Scanner(System.in);
            int Aone = addo.nextInt();
            System.out.println("type the Second digit:");
            Scanner addt = new Scanner(System.in);
            int Atwo = addt.nextInt();
            System.out.println((Aone) + (Atwo));
        }
        else if(Objects.equals(a, "S")){
            System.out.println("type the first digit:");
            Scanner Subo = new Scanner(System.in);
            int Sone = Subo.nextInt();
            System.out.println("type the Second digit:");
            Scanner Subt = new Scanner(System.in);
            int Stwo = Subt.nextInt();
            System.out.println((Sone) - (Stwo));
        }
        else if(Objects.equals(a, "D")){
            System.out.println("type the first digit:");
            Scanner Divo = new Scanner(System.in);
            int Done = Divo.nextInt();
            System.out.println("type the Second digit:");
            Scanner Divt = new Scanner(System.in);
            int Dtwo = Divt.nextInt();
            System.out.println((Done) / (Dtwo));
        }
        else if(Objects.equals(a, "M")){
            System.out.println("type the first digit:");
            Scanner Subo = new Scanner(System.in);
            int Sone = Subo.nextInt();
            System.out.println("type the Second digit:");
            Scanner Subt = new Scanner(System.in);
            int Stwo = Subt.nextInt();
            System.out.println((Sone) * (Stwo));
        }
        else{
            System.out.println("jaat dont care");
        }
    }


}