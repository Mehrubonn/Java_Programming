package day15_whileLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "eeeffrrrr";
        String result = "";  //"abc - should contain in the end
        for (int i = 0; i < str.length(); i++) { // i: represents index number of str
            char each = str.charAt(i); // each character of the string
            if(!result.contains("" + each)){ // if the string result does not contain the character of string str yet
                result += each; // then add the character to string result
            }
            // if the character is not contained in the new string, then we will add it to the new string
        }
        System.out.println(result);
    }
}
/*
3. Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						a
 */




