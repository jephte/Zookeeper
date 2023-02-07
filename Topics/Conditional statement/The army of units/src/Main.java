import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.print("no army");
        } else if (n <= 19) {
            System.out.print("pack");
        } else if (n <= 249) {
            System.out.print("throng");
        } else if (n <= 999) {
            System.out.print("zounds");
        } else {
            System.out.print("legion");
        }
    }
}