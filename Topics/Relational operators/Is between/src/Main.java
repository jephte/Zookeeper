import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int avant = scanner.nextInt();
        int apres = scanner.nextInt();

        boolean result = (avant >= x && x >= apres) || (avant <= x && x <= apres);
        System.out.println(result);
    }
}