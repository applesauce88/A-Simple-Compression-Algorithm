

public class Compress{
	public static void main(String[] args){
		String test = "qwwwwwwwwweeeeerrtyyyyyqqqqwEErTTT";
		
		System.out.println(compress(test));
	}
	public static String compress(String original){
		int[] numberOf = new int[original.length()];
		char[] charArray = new char[original.length()];
		int freq = 1;
		char comparison = original.charAt(0);
		int indexOfNumberOf =0;
		for (int i=1; i<original.length();i++){
			if (comparison==original.charAt(i)){
				freq++;
//				System.out.print("S");
			} else {
				numberOf[indexOfNumberOf]=freq;
				charArray[indexOfNumberOf]=comparison;
				indexOfNumberOf++;
				comparison=original.charAt(i);
				freq=1;
//				System.out.print("D");
				
			}
		}
		numberOf[indexOfNumberOf]=freq;
		charArray[indexOfNumberOf]=comparison;
		System.out.println();
		
		int counter =0;
		for (int i =0;i<numberOf.length;i++){
			if(numberOf[i]!=0){
				counter++;
			} else {
				break;
			}
		}
		int[] finalIntArray = new int[counter];
		char[] finalCharArray = new char[counter];
		for (int i=0; i<counter; i++){
			finalIntArray[i]=numberOf[i];
			finalCharArray[i]=charArray[i];
		}
		
		
//		for(int j = 0;j<finalIntArray.length;j++){
//			System.out.print(finalIntArray[j]);
//			System.out.println(finalCharArray[j]);
//		}
		
		
		String answer="";
		for (int i=0;i<finalCharArray.length;i++){
			if (finalIntArray[i]==1){
				answer = answer + finalCharArray[i];
			} else {
				answer = answer + finalIntArray[i] + finalCharArray[i];
			}
		}
//		System.out.println(answer);
		
//		String y = "q9w5e2rt5y4qw2Er3T";
//		if (answer.equals(y)){
//			System.out.println("Correct");
//		}
		return answer;
	}
}