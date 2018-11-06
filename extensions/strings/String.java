package strings;

import cse131.ArgsProcessor;

public class String {

	public static void main(java.lang.String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		java.lang.String t= ap.nextString("enter string with spaces in between like 3 + 4:");
		
		java.lang.String[] splitted = t.split(" ");
		int a = Integer.parseInt(splitted[0]); //convert this from string to int
		char d = splitted[1].toCharArray()[0];
		int b = Integer.parseInt(splitted[2]); // convert this also
//		int i=0;
//		int a=0;
//		int b=0;
//		while(Character.isDigit(t.charAt(i))) {
//			int c= Integer.parseInt(Character.toString(t.charAt(i)));
//			a=a*10+c;
//			i++;
//		}
//		while(Character.isWhitespace(t.charAt(i))) {
//			i++;
//		}
//		char d = t.charAt(i);
//		i++;
//		while(Character.isWhitespace(t.charAt(i))) {
//			i++;
//		}
//		while(i<t.length()) {
//			if(!Character.isWhitespace(t.charAt(i))) {
//				int c= Integer.parseInt(Character.toString(t.charAt(i)));
//				b=b*10+c;
//				i++;
//			}
//		}
		int q=0;
		if(d == '+') {
			q=a+b;
		}
		else if('*'== d) {
			q=a*b;
		}
		else if('-'== d) {
			q=a-b;
		}
		else {
			q=a/b;
		}
		System.out.println(splitted[0]+splitted[1]+splitted[2]+"="+q);
	}

}
