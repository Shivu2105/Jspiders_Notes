class nested
{
	public static void main(String[] args) 
	{
		// To check whether the input is vowel or consonant or number or special character
		char c = '@';

		// To check whether we are getting uppercase input 
		if(c >='A' && c<='Z'){
			if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
				System.out.println("Uppercase vowel");
			}
			else{
				System.out.println("Uppercase Consonant");
			}
		}
	
	// To check whether we are getting Lowercase input 
		else if(c >='a' && c<='z'){
			if(c == 'a' || c == 'e' || c =='i' || c =='o' || c=='u'){
				System.out.println("Lowercase Vowel");
			} else {
				System.out.println("Lowercase Consonant");
			}
		} 

// To check whether we are getting number input 
		else if(c >= '0' && c<='9'){
			System.out.println("Number");
		} 

		// To check whether we are getting Special character input 
		else {
			System.out.println("Special Character");
		}
	}
}
