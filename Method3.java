package com.method;

public class Method3 {
 char[] vowels = {'a', 'e', 'i','o', 'u'};
 boolean isVowel(char vowel) {
	for (int i = 0; i <vowels.length; i++) {
		if (vowel==vowels[i]) {
			return true;
		}
	}
	return false;
	
}
	public static void main(String[] args) {
		Method3 m3 = new Method3();
		
		boolean vowel =m3.isVowel('a');
		System.out.println(vowel);
	}

}
