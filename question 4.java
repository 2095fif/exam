package bubble;
import java.util.Arrays;

public class Bubble { 

		public static void main(String[] args) {
		    String [] alphabet = {"A", "S", "C", "I",};
			bubbleSort(alphabet);
			System.out.println("Sorted Array in Ascending Order:");
	        System.out.println(Arrays.toString(alphabet));
		}

		private static void bubbleSort(String[] alphabet) {
			for(int i = alphabet.length - 1; i >= 0; i--) {
				for(int j = 0; j < i; j++) {
				if(alphabet[j] > alphabet[j + 1]) {
				String  temp = alphabet[j];
				alphabet[j] = alphabet[j + 1];
				alphabet[j + 1] = temp;
				}
				}
				}
		}
	}
		
		
	
