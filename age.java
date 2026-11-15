import java.util.Scanner;
class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int age;
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        if (age >= 1 && age <= 120) {
            System.out.println("Valid Age");
        }
        else {
            System.out.println("Invalid Age");
        }

        sc.close();
    }
}
