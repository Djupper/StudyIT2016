package etg.prog.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {

  /*  public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        //Инициализируйте (создайте и заполните) массив тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }
        return  array ;
    }

    public static int max(int[] array) {
        //Найдите максимальное значение в этом методе
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }

        return max;
    }*/

    /* public static void main(String[] args) throws IOException {

         int[] arrayNumber = new int[10];
         String[] arrayList = new String[10];

         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         for (int i = 0; i < arrayList.length; i++) {
             String s = reader.readLine();
             arrayList[i] = s;
             arrayNumber[i] = s.length();
         }
         for (int i = 0; i < arrayList.length; i++) {
             System.out.println(arrayNumber[i]);
         }


     }*/
   /*public static void main(String[] args)throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int[] arrayNumber = new int[10];
    for (int i = 0; i < arrayNumber.length; i++) {
        arrayNumber[i] = Integer.parseInt(reader.readLine());
    }
    for(int i = arrayNumber.length-1; i>=0;i--){
        System.out.println(arrayNumber[i]);
    }
}*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arrayNumber1 = new int[10];
        int[] arrayNumber2 = new int[10];
        int[] arrayNumber = new int[20];

        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i <= arrayNumber.length / 2; i++) {
            arrayNumber1[i] = arrayNumber[i];
        }
        for (int i = arrayNumber.length / 2; i <= arrayNumber.length; i++) {
            arrayNumber2[i] = arrayNumber[i];
        }
        for (int i = 0; i < arrayNumber2.length; i++) {
            System.out.println(arrayNumber2);
        }
    }
}
