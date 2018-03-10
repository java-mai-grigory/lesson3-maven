package lesson3.primitives;

import java.util.Map;

public class Loop {

    public static void main(String[] args) {

        int count = 11;

        do
        {
            count++;
        }
        while(count < 10);

        System.out.println(count); // count = 12;

        count = 11;

        while (count < 10)
        {
            count++;
        }

        System.out.println(count); // count = 11;


        int a[] = {1, 2, 13 , 5, 6};

        //Суммирование массива
        int S = 0;
        for(int i = 0; i < a.length; i++)
            S += a[i];

        S = 0;
        for(int e : a)
           S += e;

        //Поиск максимума
        int M = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++)
            if (a[i] > M)  M = a[i];

        System.out.println(M);

    }
}
