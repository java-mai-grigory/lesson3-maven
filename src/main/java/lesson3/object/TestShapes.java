package lesson3.object;


public class TestShapes {
    public static void main(String[] args)
    {
        int  size = 10000000;
        Point lostPoint;
        Point[] p = new Point[size];
        for(int i = 0; i < p.length; i++)
            p[i] = new Point(0, 0);
    }
}
