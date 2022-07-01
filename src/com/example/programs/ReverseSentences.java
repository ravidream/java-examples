package com.example.programs;

public class ReverseSentences {
	public static void main(String args[]) {
		String sentences = "Flying Aeroplane";
		String reversed = reverse(sentences);
		System.out.println("The reversed sentences is:" + reversed);
	}

	public static String reverse(String sentences) {
		if (sentences.isEmpty())
			return sentences;
		return reverse(sentences.substring(1)) + sentences.charAt(0);
	}

}
