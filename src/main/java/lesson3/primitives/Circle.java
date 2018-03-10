package lesson3.primitives;

public class Circle {
    private double x, y, R;

    public Circle(double x, double y, double r) {
        //super();
        this.x = x;
        this.y = y;
        R = r;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    //Площадь окружности
    public double square()
    {
        return Math.PI * R * R;
    }

    //Длина окружности
    public double length()
    {
        return 2 * Math.PI * R;
    }

    //Сравниваем площади
    public int compare(Circle other)
    {
        if (this.square() > other.square()) return 1;
        else if (this.square() < other.square()) return -1;
        else return 0;
    }

    public static int compare(Circle first, Circle second)   //Статический член
    {
        if (first.square() > second.square()) return 1;
        else if (first.square() < second.square()) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", R=" + R +
                '}';
    }
    
    public String toString(boolean flag) {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", R=" + R +
                '}';
    }
}
