package lesson3.primitives;

public class break_continue {
    public static void main(String[] args) {

        int i = 0;
        int b = 0;
        while(i < 20)
        {
            i++;
            if (i == 10) continue;   //Переход на начало цикла и продолжение
            b++;
        }

        i = 0;
        b = 0;
        while(i < 20)
        {
            i++;
            if (i == 10) break;  //Выход из цикла

            b++;
        }

        System.out.println(b);
    }
}
