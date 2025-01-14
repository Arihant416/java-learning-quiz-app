public class QuestionService {
    Question[] questions = new Question[5];
    QuestionService() {
        questions[0] = new Question(0, "What am I learning", "Java", "Python", "C++", "C", "C#");
        questions[1] = new Question(1, "What should I be learning", "Python", "Python", "C++", "C", "C#");
        questions[2] = new Question(2, "What was I learning", "C++", "Python", "C++", "C", "C#");
        questions[3] = new Question(3, "What more could I be learning", "C#", "Python", "C++", "C", "C#");
        questions[4] = new Question(4, "What should I not be learning", "C", "Python", "C++", "C", "C#");
    }
    public void displayQuestions(){
        for(Question question : questions){
            System.out.println(question.getQuestion());
        }
    }


}
