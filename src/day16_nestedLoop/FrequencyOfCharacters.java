package day16_nestedLoop;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AAABBCCCCDDDDD";
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

    }
}

/*
2. FrequencyOfCharacters:
			"AAABBCCCCDDDDD"

			output:
				A3B2C4D5
 */
