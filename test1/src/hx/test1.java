package hx;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        int[] array={3,0,7,4,8,74,9};
        for (int i = 0; i < array.length-1 ; i++)
        {
            for (int j = 0; j < array.length-1-i ; j++)
            {
                int a=array[j];
                array[j]=array[j+1];
                array[j+1]=a;

            }
        }
        System.out.println(Arrays.toString(array));
    }
}
