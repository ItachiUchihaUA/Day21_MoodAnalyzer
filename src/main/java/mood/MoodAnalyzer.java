package mood;

public class MoodAnalyzer {

	static MoodAnalyzer obj = new MoodAnalyzer();
	static String message;

	public MoodAnalyzer() {
		message = "I am in a sad mood";
	}

	public MoodAnalyzer(String s) {
		message = s;
	}

	public static void main(String[] args) {
	}

	public String analyseMood(String s) {
		String st = s.toLowerCase();
		if (st.indexOf("sad") > 0) {
			return "SAD";
		} else
			return "HAPPY";
	}

	public String analyseMood() {
		String st = message.toLowerCase();
		if (st.indexOf("sad") > 0) {
			return "SAD";
		} else
			return "HAPPY";
		
	}
}
