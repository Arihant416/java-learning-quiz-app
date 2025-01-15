import java.util.Scanner;

class Main{

    public static void goQuizMode(){
        QuestionService qs = new QuestionService();
        qs.playQuiz();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Quiz App 😊");
        System.out.println("Press 1 to start, 2 to Exit.");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Entering game zone... All the best for your quiz!");
                goQuizMode();
                break;
            }
            case 2: {
                System.out.println("Exiting game... See you soon");
                System.exit(0);
            }
            default: {
                System.out.println("Invalid choice, please try again.");
                System.exit(1);
            }
        }
    }
}