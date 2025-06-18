package hw;

public class hw2 {
    public static void main(String[] args){
        one();
        two();
        three();
        four();
        five();
        six();
        seven();
        eight();
        nine();
    }
    private static void one(){
        String str = "Hello this is Java";
        String[] words = str.split(" ");
        System.out.println("Number of words: " + words.length);
    }
    private static void two(){
        System.out.println("This program tells that if sentence is in uppercase or not");
        String word = "HELLO";
        if (word.equals(word.toUpperCase())) {
            System.out.println("All letters are uppercase.");
        } else {
            System.out.println("All letters are not uppercase.");
        }
    }
    private static void three(){
        System.out.println("This program tells that if sentence is in lowercase or not");
        String word = "hello";
        if (word.equals(word.toLowerCase())) {
            System.out.println("All letters are lowercase.");
        } else {
            System.out.println("All letters are not lowercase.");
        }
    }
    private static void four(){
        String str = "hello java world";
        String[] words = str.split(" ");
        for (String word : words) {
            String cap = word.substring(0, 1).toUpperCase() + word.substring(1);
            System.out.println(cap + " ");
        }
    }
    private static void five(){
        String str = "hELLO jAVa wORLD";
        String[] words = str.split(" ");
        for (String word : words) {
            String cap = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            System.out.println(cap + " ");
        }
    }
    private static void six(){
        String str = "replaceme to replaceme but you can't replaceme";
        str = str.replace("replaceme", "replaced");
        System.out.println(str);
    }
    private static void seven(){
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        boolean same = true;
        if (a.length != b.length) {
            same = false;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    same = false;
                    break;
                }
            }
        }

        if (same) {
            System.out.println("Arrays are same");
        } else {
            System.out.println("Arrays are not same");
        }
    }
    private static void eight(){
        int[] arr = {9, 6, 4, 2};
        boolean decreasing = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                decreasing = false;
                break;
            }
        }

        if (decreasing) {
            System.out.println("Array is in decreasing order");
        } else {
            System.out.println("Array is not in decreasing order");
        }
    }
    private static void nine(){
        int[] arr = {1, 5, 2, 6, 7, 8};
        int evenSum = 0, oddSum = 0;

        for (int num : arr) {
            if (num % 2 == 0)
                evenSum += num;
            else
                oddSum += num;
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }



}
