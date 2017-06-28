import org.junit.*;
import static org.junit.Assert.*;
//import java.util.ArrayList;
//import java.util.List;


public class ScrabbleScorerTest {
  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }
  @Test
  public void calculateScore_returnsScoreForTwoLetters_2() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 2;
    assertEquals(expected, testScrabble.calculateScore("ae"));
  }
  @Test
  public void calculateScore_returnsScoreForTenLetters_3() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 10;
    assertEquals(expected, testScrabble.calculateScore("aeioulnrst"));
  }
  @Test
  public void calculateScore_returnsScoreForDogLetters_4() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 5;
    assertEquals(expected, testScrabble.calculateScore("dog"));
  }
  @Test
  public void calculateScore_returnsScoreForBadLetters_5() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 6;
    assertEquals(expected, testScrabble.calculateScore("bad"));
  }
  @Test
  public void calculateScore_returnsScoreForFollowLetters_6() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 12;
    assertEquals(expected, testScrabble.calculateScore("follow"));
  }
  @Test
  public void calculateScore_returnsScoreForKeyLetters_7() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 10;
    assertEquals(expected, testScrabble.calculateScore("key"));
  }
  @Test
  public void calculateScore_returnsScoreForJoyLetters_8() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 13;
    assertEquals(expected, testScrabble.calculateScore("joy"));
  }
  @Test
  public void calculateScore_returnsScoreForQuitLetters_9() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 13;
    assertEquals(expected, testScrabble.calculateScore("quit"));
  }
  
}
