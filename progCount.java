import java.util.*;

public class progCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		String s1[] = s.split(" ");
		String res = s.replaceAll(" ","");
		res = res.toLowerCase();
		// counting no. of vowels
		int vowCount = 0;
		for(int i = 0;i<res.length();i++) {
			if(res.charAt(i) == 'a' || res.charAt(i) == 'e' || res.charAt(i) == 'i' || res.charAt(i) == 'o' || res.charAt(i) == 'u')  {
			vowCount++;	
			}
		}
		
		
		System.out.println("No. of Words: "+s1.length);
		System.out.println("No. of letters (Includes white space): "+s.length());
		System.out.println("No. of letters (Not Includes white space): "+res.length());
		System.out.println("No. of Vowels: "+vowCount);
		System.out.println("No. of Consonants: "+ (res.length()-vowCount));
		
		sc.close();
	}
}
