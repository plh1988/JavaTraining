import java.util.Arrays;

public class MainMethod{
	public static void main(String [] args){
		System.out.println("Main method 1 is executed");
		System.out.println(Arrays.toString(args));
	}

	public static void main(String [] args, int index){
		System.out.println("Main method 2 is executed");
		System.out.println(Arrays.toString(args));
	}
}