package day07_ifStatements;

public class MultiBranchIf {

    public static void main(String[] args) {

        int num = 100;

        String result = "";

        if(num>0){
            result = "Positive";
        }

        if(num<0){
            result = "Negative";
        }

        if(num==0){
            result = "Zero";
        }

        System.out.println(result);
        System.out.println("--------------------------------------------------");

        String result2 = "";
        if(num>0) {
            result = "Positive";
        }else if(num<0) {
            result = "Negative";
        }else{
            result = "Zero";
        }

        System.out.println(result);




    }
}
