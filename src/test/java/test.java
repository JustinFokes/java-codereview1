import java.util.Arrays;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class test {

  	@Test
  	public void testInput_takesSingleVowelInputAndReturnsDash_dash() {
	    WordPuzzle wordPuzzle = new WordPuzzle();
	    String input = new String("a");
	    String expected = "-";
	    assertEquals(expected, wordPuzzle.wordPuzzleMethod(input));
  }
    @Test
  	public void testInput_takesDoubleVowelInputAndReturnsDash_dash() {
	    WordPuzzle wordPuzzle = new WordPuzzle();
	    String input = new String("app tap");
	    String expected = "-pp t-p";
	    assertEquals(expected, wordPuzzle.wordPuzzleMethod(input));
  }
    @Test
	public void testInput_takesTwoDifferentVowelInputsAndReturnsDash_dash() {
	    WordPuzzle wordPuzzle = new WordPuzzle();
	    String input = new String("apple");
	    String expected = "-ppl-";
	    assertEquals(expected, wordPuzzle.wordPuzzleMethod(input));
  }
    @Test
  	public void testInput_takesAllVowelInputsAndReturnsDash_dash() {
    	WordPuzzle wordPuzzle = new WordPuzzle();
    	String input = new String("an apple is tasty in my mouth");
    	String expected = "-n -ppl- -s t-st- -n m- m--th";
    	assertEquals(expected, wordPuzzle.wordPuzzleMethod(input));
  }
    @Test
  	public void testFinal_takesAllVowelInputsOfDifferentCasesAndReturnsDash_dash() {
    	WordPuzzle wordPuzzle = new WordPuzzle();
    	String input = new String("an Apple Is tasty In my moUth");
    	String expected = "-n -ppl- -s t-st- -n m- m--th";
    	assertEquals(expected, wordPuzzle.wordPuzzleMethod(input));
  }
}
