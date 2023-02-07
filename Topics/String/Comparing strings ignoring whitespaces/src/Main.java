import java.util.Scanner;

class Main {

    public static String clean (String s){
        return s.trim().replace(" ", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        String s1Clean = clean(s1);
        String s2Clean = clean(s2);

        System.out.print(s1Clean.equals(s2Clean));
    }
}