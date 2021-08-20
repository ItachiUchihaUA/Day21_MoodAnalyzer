package mood;

import java.util.Scanner;

public class MoodAnalyzer {

	static String message;

	public MoodAnalyzer() {
		message = "I am in a Happy mood";
	}

	public MoodAnalyzer(String s) {
		message = s;
	}

	public static void main(String[] args) {
		MoodAnalyzer obj;
		System.out.println("Enter Message: ");
		Scanner sc = new Scanner(System.in);
		try{
			String input = sc.nextLine();
			if(input.isEmpty()) {
				throw new MoodAnalysisException();
			}
		obj = new MoodAnalyzer(input);
		}
		catch(MoodAnalysisException e) {
			obj = new MoodAnalyzer();
			System.out.println(e.getMessage());
		}
		System.out.println(obj.analyseMood());
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

class MoodAnalysisException extends Exception{
	@Override
	public String getMessage() {
		return "Message is Empty";
	}
}
