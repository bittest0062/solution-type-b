package problem02;

public class Div implements Arithmetic{

	@Override
	public int calculate(int a, int b) {
		if(a==0 && b==0)
		{
			return 0;
		}
		
		return a/b;
	}

}
