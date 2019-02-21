package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		
		int temp = 0;
		int maxnum_1 = 0;
		int maxnum_2 = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		
		maxnum_1 = arr[0]*arr[1];
		maxnum_2 = arr[3]*arr[4];
		
		String result = new String();
		
		if(maxnum_1 > maxnum_2)
		{
			result = String.format("[%d,%d]", arr[1],arr[0]);
		}
		else if(maxnum_1 < maxnum_2)
		{
			result = String.format("[%d,%d]", arr[4],arr[3]);
		}
		else if(maxnum_1 == maxnum_2)
		{
			result = String.format("[%d,%d]", arr[4],arr[3]);
		}
		
		System.out.print(result);
		
	}
}
