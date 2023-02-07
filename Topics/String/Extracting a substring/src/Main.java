import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int debut = scanner.nextInt();
        int fin = scanner.nextInt();

        System.out.println(word.substring(debut,fin+1));



    }
}