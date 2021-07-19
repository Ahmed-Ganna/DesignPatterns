package structural.proxy;

public class TwitterDemo {

	public static void main(String[] args) {
		TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());

		//System.out.println(service.getTimeLine("UAEmGov"));
		service.postTimeLine("EMUD","a post that should not go through");
	}
}
