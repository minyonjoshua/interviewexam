import junit.framework.Assert;

import org.testng.annotations.Test;

/**
* This was a nice exercise to refresh myself on some Java
* I had to teach myself maven today but it was a great learning
* experience.  I liked using notepad++ to write the code and
* using command line to test it.
**/

@Test
public class InterviewQuestionTest {
	
	@Test
	public void testReverseWord(){
		InterviewQuestion interviewQuestion = new InterviewQuestion();
		String actual = interviewQuestion.reverseWords("foo bar baz");
		Assert.assertEquals("baz bar foo", actual);
	}
	
	
	/**
	*** This will test the output of the code
	*** when there are extra spaces placed in
	*** between each word of the input.
	**/
	@Test
	public void testMultipleSpaces(){
		InterviewQuestion interviewQuestion = new InterviewQuestion();
		String actual = interviewQuestion.reverseWords("foo  bar    baz");
		Assert.assertEquals("baz bar foo", actual);
	}
	
	
	/**
	*** This will test the output of the code
	*** when there are extra spaces placed at
	*** the beginning of the input.
	**/
	@Test
	public void testLeadSpace(){
		InterviewQuestion interviewQuestion = new InterviewQuestion();
		String actual = interviewQuestion.reverseWords("   foo bar baz");
		Assert.assertEquals("baz bar foo", actual);
	}
	
	
	/**
	*** This will test the output of the code
	*** when there are extra spaces placed at
	*** the end of the input.
	**/
	@Test
	public void testTrailSpace(){
		InterviewQuestion interviewQuestion = new InterviewQuestion();
		String actual = interviewQuestion.reverseWords("foo bar baz   ");
		Assert.assertEquals("baz bar foo", actual);
	}

}
