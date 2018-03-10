package lesson3.primitives;

import java.util.ArrayList;

public class arrays {
    public static void main(String[] args) {

        //Споcобы инициализации одномерного массива
        int[] arr = new int[]{5, 6, 3, 2, 1, 2};
        int[] arr2 = {5, 6, 3, 2, 1, 2};
        int[] arr3 = new int[3];
        arr3[0] = 9;
        arr3[1] = 4;
        arr3[2] = 19;


        //Споcобы инициализации двумерного массива
        int[][] points = {{0,0},{1, 1}, {2, 2}, {3, 3}};

        int[][] points2 =  new int[4][];
        points2[0] = new int[2];
        points2[1] = new int[2];
        points2[2] = new int[2];
        points2[3] = new int[2];

        int points3[][] = new int[4][2];
        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 2; j++)
                points3[i][j] = 1;

        String[] names = {"Ольга", "Анна", "Ирина"};  // Массив строк

        for(String name : names)
        {
            name = "Test";                  //    Присваивание касается локальной и не меняет элементы массива
        }

        for(int i = 0; i < names.length; i++)
        {
            names[i] = "Test";
        }

        for(String name : names)            //Специальные циклы перебора элементов массива
        {
            //Печать
            System.out.println(name);
        }

        //Массив объектов
        Circle c[] = new Circle[3];
        c[0] = new Circle(0, 1, 1);
        c[1] = new Circle(0, 0, 2);
        c[2] = new Circle(2, 2, 2);

        //Простейшие коллекции
        ArrayList<Circle> CircleList = new ArrayList();
        CircleList.add(new Circle(0, 1, 1));
        CircleList.add(new Circle(0, 0, 2));

        for(Circle circle : CircleList)
            System.out.println(circle);  // Печатает в соответствии с переопределенной функцией toString
    }
}
