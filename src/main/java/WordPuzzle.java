import java.util.Arrays;
import java.util.*;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class WordPuzzle {
		public static void main(String[] args) {
	}	
		public static String wordPuzzleMethod(String input){
		
		String newInput = new String(input);
		String finalOutPut = newInput.replace("a", "-");
		System.out.println(finalOutPut);
		return finalOutPut;
	}	

}
