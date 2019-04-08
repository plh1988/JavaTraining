public class Rev{
	public static void main(String[]args){
		rev(1234);			
	}

	public static void rev(int n){
		int temp = 0;
		int x;
		while(n>0){
			temp = temp * 10;
			x = n%10;
			n = n/10;
			temp = temp + x;
		}
		System.out.println(temp);
	}
}