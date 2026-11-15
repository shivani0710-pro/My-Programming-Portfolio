import java.util.Scanner;
class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        double avg;
        System.out.print("Enter 4 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d= sc.nextInt();
        avg = (a + b + c + d) / 4.0;
        System.out.println("Average = " + avg);
        sc.close();
    }
}
