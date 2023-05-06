package utilities;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabcccd";
        String unique = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) { // checks how many items the ch has appeared in str
                if (str.charAt(i) == ch) { // if the ch has appeared in the sting
                    frequency++; // increase the frequency by i
                }
            }
            if (frequency == 1) { //if the frequency is 1, then it is unique
                unique += ch;
            }


        }
        System.out.println(unique);
    }}
/*
 Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */

