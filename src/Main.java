import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the x, a and b for the first object: ");
        Math obj1 = new Math(in.nextInt(), in.nextInt(), in.nextInt());
        int res11 = obj1.meth1();
        double res12 = obj1.meth2();
        double res13 = obj1.meth3();

        System.out.println("Enter the x, a and b for the second object: ");
        Math obj2 = new Math(in.nextInt(), in.nextInt(), in.nextInt());
        int res21 = obj2.meth1();
        double res22 = obj2.meth2();
        double res23 = obj2.meth3();

        System.out.println("Enter the x, a and b for the third object: ");
        Math obj3 = new Math(in.nextInt(), in.nextInt(), in.nextInt());
        int res31 = obj3.meth1();
        double res32 = obj3.meth2();
        double res33 = obj3.meth3();

        System.out.println("Results for object 1:");
        System.out.println("method1: " + res11);
        System.out.println("method2: " + res12);
        System.out.println("method3: " + res13);

        System.out.println("Results for object 2:");
        System.out.println("method1: " + res21);
        System.out.println("method2: " + res22);
        System.out.println("method3: " + res23);

        System.out.println("Results for object 3:");
        System.out.println("method1: " + res31);
        System.out.println("method2: " + res32);
        System.out.println("method3: " + res33);

        in.close();
    }
}

class Math {
    public int x;
    public int a;
    public int b;

    public Math(int x, int a, int b) {
        this.x = x;
        this.a = a;
        this.b = b;
    }

    public int meth1() {
        return 3 * x + 5;
    }

    public double meth2() {
        if (a == b) {
            System.out.println("Can't divide by 0");
            return Double.NaN;
        }
        else {
            return (double) (a + b) / (a - b);
        }
    }

    public double meth3() {
        double result = 1;
        double n = (double) (a * x) / b;

        if (b == 0) {
            System.out.println("Can't divide by 0");
            return Double.NaN;
        }

       else {
            if (n < 0){
                System.out.println("Factorial of a negative number is not defined.");
                return Double.NaN;
            }

            if (n == 0) {
                return 1;
            }

            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        }

        return result;
    }
}