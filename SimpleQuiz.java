import java.util.Scanner;

public class SimpleQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        String answer;

        System.out.println("===== Welcome to the Java Quiz =====\n");

        // Question 1
        System.out.println("1. Who invented Java?");
        System.out.println("A. James Gosling");
        System.out.println("B. Dennis Ritchie");
        System.out.println("C. Bjarne Stroustrup");
        System.out.println("D. Guido van Rossum");
        System.out.print("Your answer: ");
        answer = sc.nextLine();
        if (answer.equalsIgnoreCase("A")) score++;

        // Question 2
        System.out.println("\n2. Which keyword is used to inherit a class in Java?");
        System.out.println("A. this");
        System.out.println("B. super");
        System.out.println("C. extends");
        System.out.println("D. implements");
        System.out.print("Your answer: ");
        answer = sc.nextLine();
        if (answer.equalsIgnoreCase("C")) score++;

        // Question 3
        System.out.println("\n3. What is the default value of a boolean variable?");
        System.out.println("A. true");
        System.out.println("B. false");
        System.out.println("C. 0");
        System.out.println("D. null");
        System.out.print("Your answer: ");
        answer = sc.nextLine();
        if (answer.equalsIgnoreCase("B")) score++;

        // Result
        System.out.println("\n===== Quiz Over! =====");
        System.out.println("Your Score: " + score + "/3");

        sc.close();
    }
}