import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selections = new String[5];
    QuestionService() {
        System.out.println("Loading questions...");
        questions[0] = new Question(1, "What is the capital of France ?", "Paris", "Paris", "Berlin", "Madrid", "Rome");
        questions[1] = new Question(2, "Which programming language is best suited for Android development ?", "Kotlin", "Kotlin", "C++", "Python", "C#");
        questions[2] = new Question(3, "What is 2 + 2 ?", "4", "3", "2", "4", "5");
        questions[3] = new Question(4, "What is the primary language used for web development ?", "JavaScript", "Java", "Python", "C++", "JavaScript");
        questions[4] = new Question(5, "What is the extension for Java files ?", ".java", ".py", ".cpp", ".cs", ".java");
        System.out.println("Questions loaded successfully!");
    }

    public void playQuiz() {
        for (Question question : questions) {
            question.printQuestion();
            System.out.println("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            while(true){
                int selection = sc.nextInt();
                if(selection < 1 || selection > 4){
                    System.out.println("Incorrect choice : Please reselect");
                }else{
                    switch(selection){
                        case 1 -> selections[question.getId()-1] = question.getOption1();
                        case 2 -> selections[question.getId()-1] = question.getOption2();
                        case 3 -> selections[question.getId()-1] = question.getOption3();
                        case 4 -> selections[question.getId()-1] = question.getOption4();
                        default -> System.exit(1);
                    }
                    break;
                }

            }

        }
        System.out.println("Congratulations! You have completed the quiz successfully!");
        int score = getScore();
        System.out.println("You have scored " + score + "/" + questions.length);
    }

    public int getScore(){
        int correctCount = 0;
        for(int i = 0 ;i < selections.length; i++){
            if(questions[i].getRightAnswer() == selections[i])correctCount++;
        }
        return correctCount;
    }
}
