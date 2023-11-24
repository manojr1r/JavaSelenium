package JavaSelenium.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class passwordExtract {
	public static void main(String[] args) {
		String sentence  ="This sentence consists of password am#@1t of it";
		sentence.split("/'");
		System.out.println(password(sentence));
		 
	}
	public static String password(String sentence) {
		List<String> words = Arrays.asList(sentence.split(" "));
		 return words.stream()
	                .filter(word -> word.contains("'"))
	                .map(word -> word.replaceAll("[']", ""))
	                .collect(Collectors.joining());
		
	}
	
}
