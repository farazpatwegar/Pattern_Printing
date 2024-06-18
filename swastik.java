package star_pattern;

import java.util.Scanner;

public class swastik {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of star to print swastik");
		int n=sc.nextInt();
		if(n%2 == 1) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(i==((n/2)+1) || j==((n/2)+1) || (i==1 && j>=((n/2)+1)) || (i==n && j<=((n/2)+1))
							|| (i<=((n/2)+1) && j==1) || (i>=((n/2)+1) && j==n)) {
						System.out.print(" * ");
					}
					else {
						System.out.print("   ");
					}
				}
				System.out.println();
			}
		}else {
			System.out.println("Enter odd no to print swastik");
		}
	}

}
