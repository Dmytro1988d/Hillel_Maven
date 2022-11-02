import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Questions questions1 = new Questions("What is the capital of Ukraine?");
        Answers answers1wrong = new Answers("1. London");
        Answers answers2wrong = new Answers("2. Brartislava");
        Answers answersRight1 = new Answers("3. Kiev");

        Questions questions2 = new Questions("What is the faster?");
        Answers answers4wrong = new Answers("1. 100km/h");
        Answers answersRight2 = new Answers("2. 600 mp/h");
        Answers answers6wrong = new Answers("3. 60mp/h");

        Questions questions3 = new Questions("What is strongest course of IT?");
        Answers answers7wrong = new Answers("1. Java");
        Answers answers8wrong = new Answers("2. QA");
        Answers answersRight3 = new Answers("3. C++");

        int i = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Read the Question");
        questions1.selectQuestion();
        answers1wrong.showAnswers();
        answers2wrong.showAnswers();
        answersRight1.showAnswers();
        System.out.println("Enter right number of answer: 1, 2 or 3");
        int a = scanner.nextInt();
        if (a == 3){
            i++;
            System.out.println("Right answer");
        }else {
            System.out.println("Incorrect");
        }

        System.out.println("Read the Question number 2");
        questions2.selectQuestion();
        answers4wrong.showAnswers();
        answersRight2.showAnswers();
        answers6wrong.showAnswers();
        System.out.println("Enter right number of answer: 1, 2 or 3");
        int b = scanner.nextInt();
        if (b == 2) {
            i++;
            System.out.println("Right answer");
        } else  {
            System.out.println("Incorrect");
        }
        System.out.println("Read the Question number 3");
        questions3.selectQuestion();
        answers7wrong.showAnswers();
        answers8wrong.showAnswers();
        answersRight3.showAnswers();
        System.out.println("Enter right number of answer: 1, 2 or 3");
        int c = scanner.nextInt();
        if (c == 3) {
            i++;
            System.out.println("Wright answer");
        } else  {
            System.out.println("Incorrect");
        }
        System.out.println("Game over with total score of right answers = " + i);
    }
}
