package exception;

public class IlligalAgeException extends Exception{
    
    //默认构造器
    public IlligalAgeException(){

    }
    public IlligalAgeException(String messageString){
        super(messageString);
    }
}
