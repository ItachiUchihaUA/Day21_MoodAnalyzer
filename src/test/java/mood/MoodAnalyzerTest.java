package mood;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MoodAnalyzerTest {
	
	MoodAnalyzer m = new MoodAnalyzer();
	
	@Test
	public void TC1ToReturnSad() {
		assertEquals("SAD", m.analyseMood("I am in Sad Mood"));
	}
	@Test
	public void TC2ToReturnHappy() {
		assertEquals("HAPPY", m.analyseMood("I am in Any Mood"));
	}
	
	@Test
	public void TCForConstructorWithSadMessage() {
		MoodAnalyzer c = new MoodAnalyzer("I am in sad mood ");
		assertEquals("SAD",c.analyseMood());
		
	}
	@Test
	public void TCForConstructorWithHappyMessage() {
		MoodAnalyzer c = new MoodAnalyzer("I am in Happy mood ");
		assertEquals("HAPPY",c.analyseMood());
		
	}
}
