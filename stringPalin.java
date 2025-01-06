import java.util.*;
public class stringPalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.next();
		String res = "";
		for(int i=str.length()-1;i>-1;i--) {
			res +=str.charAt(i);		
		}
		if(str.equals(res)) 
			System.out.println("Yes, it is Pallindrome");
		else
			System.out.println("Not palindrome");
		
		
		sc.close();
	}

}
