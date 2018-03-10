package lesson3.primitives;

public class procedures {

    static public void main(String[] arg)
    {
        int a = 1;
        int b = 2;
        System.out.println(sum(a, b) + " " + a + " " + b); //a и b не изменились

        Circle c = new Circle(0, 0, 0);
        Circle_Move(c);
        System.out.println(c);
    }

    static int sum(int a, int b) {
        //name + params = signature
        int result = a + b;
        a = 100;     //Переданы копии
        b = 200;
        return result;
    }

    static  void Circle_Move(Circle circle) {  // Передали ссылку на объект

        circle.setX(circle.getX() + 5);
        circle.setY(circle.getY() + 5);
    }
}
