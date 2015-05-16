
public class InterviewQuestion {
	
	/**
	 * This function takes a space separated string of words and
	 * reverses the word order. So if the input string is
	 * "foo bar baz" the function will return "baz bar foo".
	 * 
	 * @param input a space separated string of words
	 * @return a space separated string of words in reverse order from the input
	 */
	public String reverseWords(String input){
		/** 
		* This makes an array of
		* each input word and separates
		* them by finding the spaces 
		* between each word, it also 
		* trims any extra spaces put 
		* into the input.
		* Then it reverses the words 
		* and joins them together again.
		
		* I did a lot of research into
		* the many ways to complete this
		* and this seemed the most 
		* efficient way to do it after
		* checking online.
		**/
		String[] words = input.trim().split("\\s+");
		
		StringBuilder builder = new StringBuilder();
		
		builder.append(words[words.length - 1]);
		
		for (int i = words.length - 2; i >=0; --i) {
			
			builder.append(" ").append(words[i]);
		}
		
		return builder.toString();
	}

}
