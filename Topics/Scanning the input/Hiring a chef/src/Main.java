import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String experience = scanner.nextLine();
        String preference = scanner.nextLine();

        String reponse =
                "The form for %s is completed. " +
                "We will contact you if we need a chef who cooks %s dishes " +
                "and has %s years of experience.";
        System.out.printf(reponse, name, preference, experience);
    }
}