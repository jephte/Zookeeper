import java.util.Scanner;

class Main {

    public  static int calculateDesk(int students){
        if (students%2 == 1){
            return students/2 + 1 ;
        } else {
            return students / 2 ;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupe1 = scanner.nextInt();
        int groupe2 = scanner.nextInt();
        int groupe3 = scanner.nextInt();

        int nbDeskGroupe1 = calculateDesk(groupe1);
        int nbDeskGroupe2 = calculateDesk(groupe2);
        int nbDeskGroupe3 = calculateDesk(groupe3);

        System.out.println(nbDeskGroupe1 + nbDeskGroupe2 + nbDeskGroupe3);
    }
}