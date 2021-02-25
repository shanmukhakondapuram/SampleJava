package sampleTest.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProgram {
	
	
	public String findMaxChar(String str) {
	    char[] array = str.toCharArray();
	    int maxCount = 1;
	    char maxChar = array[0];
	    for(int i = 0, j = 0; i < str.length() - 1; i = j){
	        int count = 1;
	        while (++j < str.length() && array[i] == array[j]) {
	            count++;
	        }
	        if (count > maxCount) {
	            maxCount = count;
	            maxChar = array[i];
	        }
	    }
	    return (maxChar + " = " + maxCount);
	}
	
	public String getMaxCharacter(String str) {
		
		char[] array = str.toCharArray();
	    int actualCount = 0;
	    char actualcharacter = '\0';
	    for(int i = 0; i < str.length(); i++){
	    	int tempcount = 0;
	    	for(int j = 0; j < str.length(); j++)
	    		if(array[i] == array[j])
	    			tempcount++;
	    	if(tempcount > actualCount) {
	    		actualCount = tempcount;
	    		actualcharacter = array[i];
	    	}
	    }
		return actualcharacter + " " + actualCount;
		
	}
	public static void main(String[] args) {
		//1. Program to get the maximum occurence character in a string
		
		String source = "ANJANEYA IS GOOD";
		HashMap<Character,Integer> charlist = new HashMap<>();
		char[] sourcechar = source.toCharArray();
		
		for(int i = 0; i < sourcechar.length; i++)
			if(!charlist.containsKey(sourcechar[i]))
				charlist.put(sourcechar[i],1);
			else
				charlist.put(sourcechar[i], charlist.get(sourcechar[i]) + 1);
					
		System.out.println(charlist);
		
		StringProgram sp =  new StringProgram(); 
		
		System.out.println(sp.getMaxCharacter("ABC"));
		
		System.out.println("SubString: " + "ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(1, 5));
		
		//Program to replace all line breaks in a string
		
		String str = "All 23the be6st67\n	Java Programming ";
		System.out.println(str);
		
		System.out.println("Result is: " + str.replaceAll("[\\s]",""));
		
		String strquotes = "The data wanted is 'Java One'  The data wanted is 'Two Three'";
		System.out.println(strquotes.replaceAll("'([^']*)'", "-"));
		
		Pattern p = Pattern.compile("'([^']*)'");
		Matcher m = p.matcher(strquotes);
		
		while(m.find())
			System.out.println("String Extracted: " + m.group());
		
		String strvowles = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strvowles.length());
		System.out.println(strvowles.replaceAll("[A|E|I|O|U|a|e|i|o|u]", "").length());
		System.out.println(strvowles.length() - strvowles.replaceAll("[A|E|I|O|U|a|e|i|o|u]", "").length());
		
		
		// sum of digits in a string
		int sum = 0;
		String strdigits = "Java 2345Programming1234";
		char[] charstring = strdigits.toCharArray();
		for(int i =0; i < charstring.length; i++)
			if(Character.isDigit(charstring[i])) {
				String str1 = new String(" " + charstring[i]);
				sum = sum + Integer.parseInt(str1.trim());
			}
		
		System.out.println("Sum is: " + sum);
				
		//join the elements in arraylist using a delimiter
		ArrayList<String> stringlist = new ArrayList<>();
		stringlist.add("shan1");
		stringlist.add("shan2");
		stringlist.add("shan3");
		stringlist.add("shan4");
		stringlist.add("shan5");
		stringlist.add("shan6");
		
		String NewString = String.join(",", stringlist);
		System.out.println("Joind dstring: " + NewString);

	
		
		
		//smallest and Largest Polindrom words
		
		String[] strmain = "wow madam a for the malayalam".split(" ");
		int intmin =0,intmax = 0;
		String minString=null, maxString=null;
		for(String streach : strmain) {
			
			boolean blglag = true;
			//check whether it is a polindrom or nor
			for(int i = 0, n = streach.length()-1; n >=0 ; i++,n--) {
				if(streach.charAt(i) == streach.charAt(n)) {
				
				}else {
					blglag = false;
				}
			}
			//validate the max and min length words
			
			if(blglag) {
				System.out.println("Polindrom strings are: " +streach );
				if(intmin == 0)
					intmin = streach.length();
				
				if(streach.length() < intmin) {
					minString = streach;
				}
				if(streach.length() > intmax ) {
					maxString = streach;
				}
			}
			
			
		}
	
		System.out.println("min String:" + minString + " max String: " + maxString);
	
	//substrings of a string
		
	String strSub = "Rama";
	
	for(int i = 0 ; i < strSub.length();i++)
		for(int j = i + 1; j < strSub.length() + 1; j++)
			System.out.println("Sunstrings are: " + strSub.substring(i, j));
		
	// adding a separator for thousands
	
	int x = 1234556;
	int count = 0;
	StringBuffer sb = new StringBuffer();
	if(new Integer(x).toString().length() > 3) {
		
		while(x > 0) {
			int h = x%10;
			x = x/10;
			count++;
			if(count == 3) {
				sb.append(h);
				sb.append(",");
				count = 0;
			}else {
				sb.append(h);
			}
		}
		
	}else {
		System.out.println(x);
	}
	
	System.out.println("Required number is: " + sb.reverse());
	
		
	
	}
	
	

}
