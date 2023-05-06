package utilities;

public class MathUtility {

        public static int factorial ( int number){
            int result = 1;
            for (int i = number; i > 1; i--) {
                result *= i;
            }
            return result;

        }
}