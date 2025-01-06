import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		String s1[] = str.split(" ");
		String res = "";
		
		for(int i = 0;i<s1.length;i++) {
			for(int j=s1[i].length()-1;j>-1;j--) {
				res +=s1[i].charAt(j);		
			}
			res+=" ";			
		}
		System.out.println(res.trim());
		
		
		sc.close();
	}

}
