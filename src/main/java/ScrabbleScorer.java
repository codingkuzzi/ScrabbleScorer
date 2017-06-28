import java.util.ArrayList;
import java.util.List;

public class ScrabbleScorer {

  public Integer calculateScore(String word){
    String[] alphabet = word.split("");
    int result = 0;
    for (String letter : alphabet) {
      if(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u") || letter.equals("l") || letter.equals("n") || letter.equals("r") || letter.equals("s") || letter.equals("t")){
        result += 1;
      } else if(letter.equals("d") || letter.equals("g")){
        result += 2;
      } else if(letter.equals("b") || letter.equals("c") || letter.equals("m") || letter.equals("p") ){
        result += 3;
      } else if(letter.equals("f") || letter.equals("h") || letter.equals("v") || letter.equals("w") || letter.equals("y")){
        result += 4;
      } else if(letter.equals("k")) {
        result += 5;
      } else if(letter.equals("j") || letter.equals("x")){
        result +=8;
      } else if(letter.equals("q") || letter.equals("z")){
        result +=10;
      } else {
        System.out.println("not a word");
      }

    }
    return result;
  }

}
