package Exception;

/**
 *
 * @author Nguyen Van Viet
 */
public class NotValidValue extends Exception{
    public NotValidValue(){}
    public NotValidValue(String mess){
        super(mess);
    }
}