import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x <= -15) {
            System.out.print("False");
        } else if (x <= 12) {
            System.out.print("True");
        } else if (x <= 14) {
            System.out.print("False");
        } else if (x < 17) {
            System.out.print("True");
        } else if (x < 19) {
            System.out.print("False");
        } else {
            System.out.print("True");
        }
    }
}
