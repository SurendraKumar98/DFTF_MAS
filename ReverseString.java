package day4;
import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter string:");
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.next();
			System.out.println("Enter symbol:");
			try (Scanner sc1 = new Scanner(System.in)) {
				String symb = sc1.next();
				char[] ch = str.toCharArray();
				String s="";
				for (int i = ch.length - 1; i >= 1; i--) {
				    s += ch[i]+symb;
				}
				System.out.println("answer:"+s+str.charAt(0));
			}
		}
        	
	}

	

}
