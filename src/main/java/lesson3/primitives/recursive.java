package lesson3.primitives;

public class recursive {

    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(rfact(5));
    }

    public static int fact(int n) //Факториал (пошаговый алгоритм)
    {
        int P = 1;

        if (n == 0) return 1;
        for(int i = 1; i <= n; i++)
            P *= i;

        return P;
    }

    public static int rfact(int n)  //Рекурсивный алгоритм
    {
        if(n == 0)
            return 1;
        else
            return  rfact(n - 1) * n;

    }

    //Числа фибоначчи

    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711,

    //Сделайте рекурсивную и не рекурсивную функции


}
