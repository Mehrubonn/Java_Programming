package day16_nestedLoop;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "aabbbc";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char t = str.charAt(i);
            int c = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    c++;
                }
            }
            if (!result.contains(t+"")){
                result += (t+""+c);
            }
        }
        System.out.println(result);


}}
/*
write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'

		     output:
 */