package Trip;

import java.util.Scanner;

public class Trip {
	public static void main(String args) {
		Scanner in=new Scanner(System.in);
		int cost;
		double y1,y2,y3,y4;
		int N;
		double m;
		boolean counts[]=new boolean[10];
		for(int i=0;i<10;i++) {
			cost=in.nextInt();
			y1=in.nextDouble();
			y2=in.nextDouble();
			y3=in.nextDouble();
			y4=in.nextDouble();
			N=in.nextInt();
			m=N*(y1*12+y2*10+y3*7+y4*5);
			if(m<cost/2)
				counts[i]=true;
			else
				counts[i]=false;
		}
		for(int i=0;i<10;i++) {
			if(counts[i])
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		
	}
}
