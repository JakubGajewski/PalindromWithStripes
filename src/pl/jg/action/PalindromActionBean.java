package pl.jg.action;

import java.util.Date;
import net.sourceforge.stripes.action.*;

public class PalindromActionBean implements ActionBean {
	
	private static final String VIEW = "/WEB-INF/jsp/index.jsp";
	private ActionBeanContext context;
	private String word = "";
	private String palindromeWord = "";
	private String message = "";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public ActionBeanContext getContext() {
		return this.context;
	}

	@Override
	public void setContext(ActionBeanContext context) {
		this.context = context;
	}

	public void setWord (String word) {
		this.word = word;
	}
	
	public String getWord () {
		return this.word;
	}
	
	public void setPalidromeWord (String palindromeWord) {
		this.palindromeWord = palindromeWord;
	}
	
	public String getPalindromeWord () {
		return this.palindromeWord;
	}

	@DefaultHandler
	public Resolution palindrome() {
		palindromeWord = this.makePalindrome(word);
		if (!palindromeWord.equals("")) {
			message = "Palindrome word is:";
		}
		return new ForwardResolution(VIEW);
	}
	
	public String makePalindrome (String word) {
		StringBuilder sb = new StringBuilder();
		for (int i = word.length() -1 ; i >= 0; i--) {
			sb.append(word.charAt(i));
		}
		palindromeWord = sb.toString();
		return palindromeWord;
	}
}
