package class5;

import java.util.Arrays;

public class cl {
    public static void main(String[] args){
        // reverse number code
       /** int number= 432;
        int reverednum = 0;
        while(number>0){
            int r = number % 10;
            reverednum = reverednum * 10 + r;
            number /= 10;
        }
        System.out.println(reverednum);
        */
       // fibonacci series
     /**  int a = 0;
       int b = 1;
       int c = a + b;
       while (c < 12){
           a = b;
           b = c;
           c = a + b;
           System.out.println(c);
       }
      */
    /** for (int i = 0 ; i < 11 ; i++){
         if (i == 5){
             continue;
         }
         System.out.println(i);
     }
     */
        //arrray concept
        /** it locates the location in ram acc to type of data
         * it can store one type of data
         * datatype[] newarray =new datatype[sizeoforarray];

        int[] arr = new int[]{1, 2 ,4 , 8 ,10 ,12};
        System.out.println(Arrays.toString(arr));
         * */

        /**public static void print(int[] arr){
            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i] + " ");

                System.out.println();
        }
         */
    }

}
