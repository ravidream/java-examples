package first15;

import java.util.Scanner;

public class AlbhabetORnot {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		char a= s.next().charAt(0);
		if((a>='a' && a<='z') || (a>='A' && a<='Z')) {
			System.out.println(a + " is albhabet");
			
		}
		else
		{
			System.out.println(a + " is not albhabete");

		}
	}

}
