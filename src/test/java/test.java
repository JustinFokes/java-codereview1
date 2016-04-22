import java.lang.Object;
import java.lang.String;
import java.util.Arrays;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class test {

  	@Test
  	public void userInput_takesSingleVowelInputAndReturnsDash_dash() {
	    WordPuzzle wordPuzzle = new WordPuzzle();
	    String input = new String("a");
	    String expected = "-";
	    assertEquals(expected, wordPuzzle.wordPuzzleMethod(input));
  }
    @Test
  	public void userInput_takesDoubleVowelInputAndReturnsDash_dash() {
	    WordPuzzle wordPuzzle = new WordPuzzle();
	    String input = new String("app tap");
	    String expected = "-pp t-p";
	    assertEquals(expected, wordPuzzle.wordPuzzleMethod(input));
  }
    @Test
	public void userInput_takesTwoDifferentVowelInputsAndReturnsDash_dash() {
	    WordPuzzle wordPuzzle = new WordPuzzle();
	    String input = new String("apple");
	    String expected = "-ppl-";
	    assertEquals(expected, wordPuzzle.wordPuzzleMethod(input));
  }
    @Test
  	public void userInput_takesAllVowelInputsAndReturnsDash_dash() {
    	WordPuzzle wordPuzzle = new WordPuzzle();
    	String input = new String("an apple is tasty in my mouth");
    	String expected = "-n -ppl- -s t-st- -n m- m--th";
    	assertEquals(expected, wordPuzzle.wordPuzzleMethod(input));
  }
    @Test
  	public void userInput_takesAllVowelInputsOfDifferentCasesAndReturnsDash_dash() {
    	WordPuzzle wordPuzzle = new WordPuzzle();
    	String input = new String("an Apple Is tasty In my moUth");
    	String expected = "-n -ppl- -s t-st- -n m- m--th";
    	assertEquals(expected, wordPuzzle.wordPuzzleMethod(input));
  }
  	@Test
  	public void userGuess_compareStringGuessWithStringInput_true() {
  		WordPuzzle wordPuzzle = new WordPuzzle();
  		String input1 = new String("a");
  		String input2 = new String("a");
  		String expected = "Look's like we have a match!";
  		assertEquals(expected, wordPuzzle.guessMethod(input1, input2));
  }
}
