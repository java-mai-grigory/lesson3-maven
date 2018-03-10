package lesson3.primitives;

public class typeconsoleoutput {

    public static void main(String[] args) {

            long n = 461012;
            System.out.format("%d%n", n);      //  -->  "461012"
            System.out.format("%08d%n", n);    //  -->  "00461012"
            System.out.format("%+8d%n", n);    //  -->  " +461012"
            System.out.format("%,8d%n", n);    // -->  " 461,012"
            System.out.format("%+,8d%n%n", n); //  -->  "+461,012"

            double pi = Math.PI;

            System.out.format("%f%n", pi);       // -->  "3.141593"
            System.out.format("%.3f%n", pi);     // -->  "3.142"
            System.out.format("%10.3f%n", pi);   // -->  "     3.142"
            System.out.format("%-10.3f%n", pi);  // -->  "3.142"
        }
    }
