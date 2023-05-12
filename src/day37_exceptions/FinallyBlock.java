package day37_exceptions;

public class FinallyBlock {
    public static void main(String[] args) {
        try{
            System.out.println(4/0);
        }catch (RuntimeException e){
            System.out.println("Runtime Exception has been caught");
            e.printStackTrace();
        }finally {
            System.out.println("Finally Block");
        }
    }
}
