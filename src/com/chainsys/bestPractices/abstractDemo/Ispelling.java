package com.chainsys.bestPractices.abstractDemo;

public interface Ispelling {
	void spellCheck(String word); // must be implemented by all languages
	void checkGrammar(String sentence); // must be implemented by all languages
	int wordCount(String sentence); // the logic is the same for all language
} 
abstract class Language implements Ispelling{
	@Override
	public int wordCount(String sentence) {
		String[] words=sentence.split(" ");
		System.out.println(words.length);
		return 0;
	}
}
class EnglishLanguage extends Language implements Ispelling{

	@Override
	public void spellCheck(String word) {
		System.out.println("English SpellChecker");
	}

	@Override
	public void checkGrammar(String sentence) {
		System.out.println("English CheckGrammar");

	}
	
}

class TamilhLanguage extends Language implements Ispelling{

	@Override
	public void spellCheck(String word) {
		System.out.println("Tamil SpellChecker");
	}

	@Override
	public void checkGrammar(String sentence) {
		System.out.println("Tamil CheckGrammar");

	}
}

class FrenchLanguage extends Language implements Ispelling{

	@Override
	public void spellCheck(String word) {
		System.out.println("French SpellChecker");
	}

	@Override
	public void checkGrammar(String sentence) {
		System.out.println("French CheckGrammar");

	}
}