public class Abedin{

	int[] array = {5, 10, 15, 20};
	public static void main(String[]args){
		System.out.println(30);
		Systen.out.println(40);
		Systen.out.println(50);
		System.out.println(array);
		System.out.println(60);
	}
	// How to findout maximum value from an Array.
	public static int maximumValue(int[] array){
		int maxValue = array[0];
		for (int i=0; i<array.length; i++) {
			if(array[i]>maxValue){
				maximum = array[i];
			}
			
		}
		return maxValue;
	}

	*/If age is more than 21 then print "You can buy beer."
	else "You are underage.";

	public static void printStatement(int age){
		if(age>=21){
			System.out.println("You can buy beer.")
		}else{
			System.out.println("You are underage.")
		}
	}

	*/ How to find out Even and Odd number by for loop
	and ifelsecondition?

	public static void printEvenAndOddNumber(int number){
		for(int i=1; i<number; i++){
			if(i%2==0){
				System.out.Println("Even number:" +i)
			}else{
				System.out.println("Odd number:" +i)
			}
		}
	}

	*/ Print Number: 0, 3, 6, 9, 12, 15,18.
	public static void printNumbe(int number){
		for(int i=0; i<=number; i=i+3){
			if(i==number){
				System.out.println(i + ".")

			}else{
				System.out.println(i + ",")
			}
		}
	}

		How to convert Array to ArrayList?
		public static ArrayList<Integer> getArrayToList(int[] numArray){
			ArrayList<Integer> numList = new ArrayList<Integer>();
			for(int i=0; i<numArray.length; i++){
				numList.add(numArray[i]);
			}
			return numlist;

		}

		*/ How to Convert ArrayList to Array?

		public static int[] convetArraylistToArray(ArrayList<Integer> numList){
			int[] numArray = new int[numList.size()];
			for(int i=0; i<numList.size(); i++){
				numArray[i] = numList.get(i);
			}
			return numArray;
		}
		*/ How to Sort an Array?
		public static int[] getSortedArray(int[] numArray){
			Arrays.sort(numArray);
			return numArray;
		}
	

}
