package day42_Exceptions;

class FadyException extends RuntimeException {

    public FadyException(){
        super("Time for short break");
    }


    public FadyException(String message){
        super(message);
    }
}

class NoBreakException extends RuntimeException{



}

public class CustomExceptions {

    public static void main(String[] args) {

       // throw new FadyException("baba zarali 58");

        try {

            throw new NoBreakException();
        }catch (NoBreakException e){
            e.printStackTrace();
        }
    }




}
