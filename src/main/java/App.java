import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    while (true) {
    ScrabbleScorer scrabbleGame = new ScrabbleScorer();
    System.out.println("I'm a Scrabble application! Input a word and I will calculate your Scrabble score");
    String word = myConsole.readLine();
    int score = scrabbleGame.calculateScore(word);
    System.out.println("Your Scrabble score is " + score + " points.");

   }
  }
}
