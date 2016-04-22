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
	}	
		public static String wordPuzzleMethod(String input){
		String newInput = new String(input).toLowerCase();
		String finalOutPut = newInput.replace("a", "-").replace("e", "-").replace("i", "-").replace("o", "-").replace("u", "-").replace("y", "-");
		return finalOutPut;
	}	

}

//fairly sure that I