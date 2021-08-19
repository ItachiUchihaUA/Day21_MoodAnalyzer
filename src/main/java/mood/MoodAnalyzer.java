package mood;

public class MoodAnalyzer {

	MoodAnalyzer obj = new MoodAnalyzer();
	public static String analyseMood(String s) {
		if(s.contains("sad")) {
			return "Sad";
		}else return "Happy";
	}
}
