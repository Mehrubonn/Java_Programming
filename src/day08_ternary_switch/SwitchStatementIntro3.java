package day08_ternary_switch;

public class SwitchStatementIntro3 {

    public static void main(String[] args) {


        int score = 77; // 0 - 100

        String result = "Your grade is: ";

        if(score >= 90) { // false: score < 90
            result += 'A';
        }else if(score >= 80 && score < 90) { // false: score < 80
            result += 'B';
        }else if(score >= 70 && score < 80) { // false: score < 70
            result += 'C';
        }else if(score >= 60 && score < 70) {
            result += 'D';
        }else{
            result += 'F';
        }


        //--------------------------------------

        int number = 11;

        String month = "";

        switch(number){

            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Invalid");



        }




    }
}
