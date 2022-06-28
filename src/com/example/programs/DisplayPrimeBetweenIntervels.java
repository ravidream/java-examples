import java.util.Scanner;

public class DisplayPrimeBetweenIntervels {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter range " );
		int range1 = s.nextInt();
		int range2 = s.nextInt();
	for(int j=range1;j<=range2;j++) {
		if(j==0||j==1) {
			
		}
		else if(j==2) {
			System.out.println(j);
			
		}
		else {
			int flag=0;
		for(int i=2;i<j;i++) {
			
			if (j%i==0) {
				flag =1;
				break;			
				}
			}
		  if(flag==0) {

	       System.out.println(j);	
		}
		}continue;	
		}
	}

}
