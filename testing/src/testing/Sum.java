package testing;

public class Sum {

	static int count = 0;
	static int count2= 0;

	public static void main (String[] args) {

		System.out.println( f1(6) +" - " + count2);
		System.out.println(f2(6));
		System.out.println(f3(6) );
		System.out.println(f4(6) + "- " + count);
		System.out.println(f5(6));
		System.out.println(f6(6));
		System.out.println(f7(6));

	}

	public static int f1(int N) {
		int x = 0;
		for (int i = 0; i <N; i++) {
			x++;
		}

		return x;
	}
	
	public static int f2(int N) {
		int x=0;
		for(int i = 0; i< N;i++) {
			for (int j =0; j<i; j++) {
				x++;
			}
		}

		return x;
	}

	public static int f3(int N) {
		if (N==0)
			return 1;
		int x = 0;
		for( int i = 0; i<N; i++)
			x+= f3(N-1);
		return x;

	}





	public static int f4(int N) {
		if (N==0)
			return 0;
		count++;
		return f4(N/2) +f1(N) + f4(N/2);
		//return f1(N);
	}



	



	public static int f5(int N) {
		int x=0;
		for(int i =0; i<N; i++) {
			x+=f1(i);
		}

		return x;
	}

	public static int f6(int N) {
		if (N==0) {
			return 1;
		}

		count2++;
		return f6(N-1) + f6(N-1);
	}

	public static int f7(int N) {
		if (N==1)
			return 0;
		return 1 + f7(N/2);
	}
}



