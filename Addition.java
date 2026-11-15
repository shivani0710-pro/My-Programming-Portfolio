import java.util.Scanner;
class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, sum;
        System.out.print("Enter 3 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sum = a + b + c;
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
