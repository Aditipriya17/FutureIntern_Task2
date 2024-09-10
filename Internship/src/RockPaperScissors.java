import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static String getWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock"))) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            String[] options = {"rock", "paper", "scissors"};

            System.out.println("Welcome to Rock, Paper, Scissors!");

            System.out.print("Enter your choice (rock, paper, scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();

            String computerChoice = options[random.nextInt(3)];

            System.out.println("You chose: " + userChoice);
            System.out.println("Computer chose: " + computerChoice);

            String result = getWinner(userChoice, computerChoice);
            System.out.println(result);
        }
    }
}
