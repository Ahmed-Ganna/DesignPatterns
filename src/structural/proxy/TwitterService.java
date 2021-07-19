package structural.proxy;

public interface TwitterService {


    String getTimeLine(String screenName);


    void postTimeLine(String screenName , String message);



}
