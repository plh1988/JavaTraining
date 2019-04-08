public class Fiba{
	static int n1 = 0;
        static int n2 = 1;
	static int n3 = 0;

	public static void main(String[]args){
		System.out.println("0 "+"1 ");
		fibo(13);
			
	}	
	
	public static void fibo(int count){
		
		if(count>0){
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+ n3);
			fibo(count-1);
		}
		
	}
}