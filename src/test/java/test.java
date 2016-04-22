import java.util.Arrays;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class test {

  @Test
  public void test_takesSingleVowelInputAndReturnsDash_dash() {
    WordPuzzle wordPuzzle = new WordPuzzle();
    String input = new String("a");
    String expected = "-";
    assertEquals(expected, wordPuzzle.wordPuzzleMethod(input));
  }
    @Test
  public void test_takesDoubleVowelInputAndReturnsDash_dash() {
    WordPuzzle wordPuzzle = new WordPuzzle();
    String input = new String("app tap");
    String expected = "-pp t-p";
    assertEquals(expected, wordPuzzle.wordPuzzleMethod(input));
  }
      @Test
  public void test_takesDoubleVowelInputAndReturnsDash_dash() {
    WordPuzzle wordPuzzle = new WordPuzzle();
    String input = new String("app tap");
    String expected = "-pp t-p";
    assertEquals(expected, wordPuzzle.wordPuzzleMethod(input));
  }
}
