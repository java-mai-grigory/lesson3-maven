package lesson3.primitives;

public class Conditions {
    public static void main(String[] args) {
        double res = calc(2, 4, '+');
    }

    public static double calc(int a, int b, char oper)
    {
        double res = 0;
        if (oper == '+')
        {
            res = a + b;    // Приведение не требуется
        }
        else if (oper == '-')
        {
            res = a - b;    // Приведение не требуется
        }
        else if (oper == '*')
        {
            res = a * b;
        }
        else if (oper == '/')
        {
            res = (double)a  / b; //Требуется приведение типов (иначе целое число)
        }
        else
            System.out.println("Операция не определена");
        return res;
    }

    public static double calc2(int a, int b, char oper)
    {
        double res = 0;
        switch(oper) {
            case '+': {
                res = a + b;    // Приведение не требуется
                break;
            }
            case '-': {
                res = a - b;    // Приведение не требуется
                break;
            }
            case '*': {
                res = a * b;
                break;
            }
            case  '/': {
                res = (double) a / b; //Требуется приведение типов (иначе целое число)
                break;
            }
            default:
                System.out.println("Операция не определена");
        }
        return res;
    }
}
