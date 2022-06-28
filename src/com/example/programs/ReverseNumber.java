import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int rev;
		System.out.println("Enter the number " );
		int num= s.nextInt();
		
		for(int i=0;;i++) {
			rev=num%10;
			num =num/10;
			System.out.print( rev );
			if(num==0) {
				break;
			}
		}
		
		

	}

}
