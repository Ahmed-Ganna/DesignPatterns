package structural.proxy;

public class TwitterServiceStub implements TwitterService{
    @Override
    public String getTimeLine(String screenName) {
        return "Neato timeline";
    }

    @Override
    public void postTimeLine(String screenName , String message) {

    }
}
