package day38_exceptions;

public class BreakTimeException extends RuntimeException{
    public BreakTimeException(){
        super("It`s a break time");
    }

    public BreakTimeException(String message){
        super(message);
    }
}
