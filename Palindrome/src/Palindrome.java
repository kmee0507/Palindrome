
import java.util.*;

public class Palindrome {
	static Boolean palindromeChecker(String s){
		StringBuilder str = new StringBuilder(s);
		if(s.equals(str.reverse().toString())){
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string to see if it is a palindrome: ");
		String s = sc.nextLine();
		Boolean isPalindrome = palindromeChecker(s);
		
		if(isPalindrome){
			System.out.println(s + " is a palindrome");
		}
		else{
			System.out.println(s + " is NOT a palindrome");
		}
		
	}
}
