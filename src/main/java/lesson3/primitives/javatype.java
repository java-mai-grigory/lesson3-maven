package lesson3.primitives;

public class javatype {

    public static void main( String[] args )
    {
        //Типы данных JAVA
        byte c = 127; //-128 .. 127
        short s = 6;     //-2^15 .. 2^15 - 1      /
        int i = 3255; //-2^31 .. 2^31 - 1
        long l = 7000000L; //-2^63 .. 2^63 - 1
        float f = 23.5678f;
        double d = 3.1456677;

        i = 7; //Присваивание

        int a = 5;
        int b = 15;

        i = a + b;
        i = a * b;
        i = a / b;   // результат 0;
        i = a - b;
        i = a % b;   //остаток от деления

        i += b;

        b = 7;
        b = i++; // b = 7;
        b = ++i;  // b = 8;
        b = i--; // b = 7;
        b = --i;  // b = 6;

        b = -5;
        b = (b > 0)? b: -b; // b = 5;

        i = (int)f;  //Приведение типов

        String str = "Строка текста";
        String str2 = new String("Конструктор строк");
        String str3 = new String(str2);

        String s1 = "123";
        String s2 = "123"; 
        // s1 и s2 в одной ячейке памяти

        if (str2 == str3)   // Сравниваются адреса объектов
        {
            System.out.println("String are equal");
        }

        if (str2.equals(str3))   // Сравниваются значения
        {
            System.out.println("String are equal");
        }

        Integer i1 = 2;
        Integer i2 = 2;

        if (i1 == i2)   // Сравниваются значения
        {
            System.out.println("integers are equal");
        }

        if (i1.equals(i2))   // Сравниваются значения
        {
            System.out.println("integers are equal");
        }

         //Неформатный вывод
        System.out.println(str + "\n" + "short " + s + "\n" + "int " + i + "\n" + "float " + f);

        //Результат вывода
        /*Строка текста
        short 6
        int 325555
        float 23.567*/
    }

}
