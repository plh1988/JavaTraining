import java.util.*;
public class Sort{

	public static void main(String [] args){
		int[]	numbers = {2,4,5,3,6,1};
		sort(numbers);	
	}

	public static void sort(int[] numbers){
		int last = numbers.length-1;
		int b = numbers.length-1;
		int temp;
		for(int a = 0;a<b;b--,a++){
			temp = numbers[a];
			numbers[a] = numbers[b];
			numbers[b] = temp;
		}
		System.out.println(Arrays.toString(numbers));

	}

}