package com.michaelquiapos.crystalball;

import java.util.Random;

public class CrystalBall {
	// Member variables (Properties about the object)
	
	// Array of String: String is a data type
	public String[] mAnswers = {
			"It is certain",
			"It is decidedly so",
			"All signs say YES",
			"The stars are not aligned",
			"My reply is no",
			"It is doubtful",
			"Better not to tell you now",
			"Concentrate and ask again",
			"Unable to answer now",
			"It is hard to say"
	};
	
	// Methods (abilities: things the object can do)
	public String getAnAnswer() {
		// Initialize the text element
		String answer = "";
		
		// Construct a new random number generator 
		Random randomGenerator  = new Random();
		int randomNumber = randomGenerator.nextInt(mAnswers.length);
		
		answer = mAnswers[randomNumber];
		
		return answer;
	}

}
