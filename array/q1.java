package array;

public class q1 {
	public static void main (String[] args)
	{
	int [] arg= {25,27,65,46,48};
	 for (int i =0; i<5; ++i) {
		 int a = 0;
		 System.out.println("Age at element " + (i+1) + " is: " + arg[i]);
		a= arg.length -i;
		System.out.println("element left " + (a-1));
		
	 }
	 

	 }

}
