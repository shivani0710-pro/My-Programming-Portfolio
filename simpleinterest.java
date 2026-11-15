
import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double p, r, n, si;

        System.out.print("Enter Principal Amount: ");
        p = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        r = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        n = sc.nextDouble();

        si = (p * n * r) / 100;

        System.out.println("Simple Interest = " + si);

        sc.close();
    }
}

