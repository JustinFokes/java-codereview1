import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.*;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class WordPuzzle {
		public static void main(String[] args) {
			staticFileLocation("/public");

			get("/", (request, response) -> {
      		HashMap<String, Object> model = new HashMap<String, Object>();
      		model.put("testedInput", request.session().attribute("testedInput"));
      		model.put("template", "templates/home.vtl");
      		return new ModelAndView(model, "templates/layout.vtl");
    	}, 	new VelocityTemplateEngine());

		  post("/guess", (request, response) -> {
			    HashMap<String, Object> model = new HashMap<String, Object>();
			    model.put("template", "templates/guess.vtl");
			    String userInput1 = request.queryParams("user1");
			    request.session().attribute("testedInput", userInput1);
			    WordPuzzle wordPuzzle = new WordPuzzle();
			    String outPut = wordPuzzle.wordPuzzleMethod(userInput1);
			    model.put("outPut", outPut);
      		return new ModelAndView(model, "templates/layout.vtl");
    	}, 	new VelocityTemplateEngine());

		  get("/guessedWord", (request, response) -> {
			    HashMap<String, Object> model = new HashMap<String, Object>();
			    model.put("template", "templates/guessedWord.vtl");
			    String toCompare = request.session().attribute("testedInput");
			    String userInput2 = request.queryParams("user2");
			    WordPuzzle wordPuzzle = new WordPuzzle();
			    String outPutTwo = wordPuzzle.guessMethod(toCompare, userInput2);
			    model.put("outPutTwo", outPutTwo);
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
		}
		else{
			return "Wrong guess!";
		}
	}
}
