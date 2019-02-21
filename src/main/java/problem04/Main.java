package problem04;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		String bridge = new String();
		for(int i=0;i<20;i++)
		{
			int randombridge = rand.nextInt(10);
			
			if(randombridge%2==0)
			{
				bridge+="#";
			}
			if(randombridge%2==1)
			{
				bridge+="O";
			}
		}
		
		System.out.print(bridge);

	}

}
