package org.denispozo.tutorial.thj.strings.regex;

import static org.junit.Assert.*;
import org.junit.Test;

public class SentenceMatcherEx7Test {

	@Test
	public void isASentenceTestShouldReturnTrueIfItIsASentence() {
		System.out.println("Test: isASentenceTestShouldReturnTrueIfItIsASentence");
		assertTrue(SentenceMatcherEx7.isASentence("Hello."));
		assertTrue(SentenceMatcherEx7.isASentence("H."));
		assertTrue(SentenceMatcherEx7.isASentence("Hello, I am John Doe!."));
		assertTrue(SentenceMatcherEx7.isASentence("Hello World!."));
	}
	
	@Test
	public void isASentenceTestShouldReturnFalseIfItIsASentence() {
		System.out.println("Test: isASentenceTestShouldReturnFalseIfItIsASentence");
		assertFalse(SentenceMatcherEx7.isASentence("hello"));
		assertFalse(SentenceMatcherEx7.isASentence("H"));
		assertFalse(SentenceMatcherEx7.isASentence("Hello, I am John Doe!"));
		assertFalse(SentenceMatcherEx7.isASentence("Hello World"));
	}
}
