import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.*;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class WordPuzzle {
		public static void main(String[] args) {
			get("/", (request, response) -> {
      		HashMap<String, Object> model = new HashMap<String, Object>();
      		model.put("template", "templates/home.vtl");
      		return new ModelAndView(model, "templates/layout.vtl");
    	}, 	new VelocityTemplateEngine());

		    get("/score", (request, response) -> {
		    HashMap<String, Object> model = new HashMap<String, Object>();

		    String userInput1 = request.queryParams("user1");
		    WordPuzzle wordPuzzle = new WordPuzzle();
		    String outPut = wordPuzzle.wordPuzzleMethod(userInput1);
		    model.put("outPut", outPut);

      		model.put("template", "templates/score.vtl");
      		return new ModelAndView(model, "templates/layout.vtl");
    	}, 	new VelocityTemplateEngine());

		    get("/score2", (request, response) -> {
		    HashMap<String, Object> model = new HashMap<String, Object>();
		    String userInput1 = request.queryParams("user2");
		    String userInput2 = request.queryParams("user1");
		    WordPuzzle wordPuzzleTwo = new WordPuzzle();
		    String outPutTwo = wordPuzzleTwo.guessMethod(userInput2, userInput1);
		    model.put("outPutTwo", outPutTwo);

      		model.put("template", "templates/score2.vtl");
      		return new ModelAndView(model, "templates/layout.vtl");
    	}, 	new VelocityTemplateEngine());
	}

		public static String wordPuzzleMethod(String input) {
		String newInput = new String(input).toLowerCase();
		String finalOutPut = newInput.replaceAll("a", "-").replaceAll("e", "-").replaceAll("i", "-").replaceAll("o", "-").replaceAll("u", "-").replaceAll("y", "-");
		return finalOutPut;
	}	
		public static String guessMethod(String finalOutPut, String input) {
		String firstInput = new String(finalOutPut).toLowerCase();
		String userGuess = new String(input).toLowerCase(); 
		if(firstInput.equals(userGuess)) {
		return "Look's like we have a match!";
		}else{
		return "Wrong guess!";
		}
	}
}






