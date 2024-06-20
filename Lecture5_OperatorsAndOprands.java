public class Lecture5_OperatorsAndOprands {
    

	public static void main(String[] args) {
		

		float f = (float)5.5;
		System.out.println(f);

		double d = 10.5;
		System.out.println(d);

		char ch = 'a';
		System.out.println(ch);

		int x = 7;
		int y = 3;
		int z = x + y; //+ => operator, x,y => oprands
		System.out.println(z);

		//Increment and Decrement operators

		int m = 5;
		int n = m++;
		System.out.println("M is "+ m + " N is "+ n);

		int p = 5;
		int q = ++p;
		System.out.println("P is "+ p + " Q is "+ q);
	}


}
