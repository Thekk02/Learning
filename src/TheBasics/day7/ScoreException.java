package TheBasics.day7;
//自定义异常类
public class ScoreException extends Exception{
    public ScoreException(){}
    public ScoreException(String message){
        super(message);
    }
}
