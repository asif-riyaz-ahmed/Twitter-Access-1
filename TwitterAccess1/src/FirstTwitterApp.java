import twitter4j.conf.ConfigurationBuilder;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.Status;
import java.util.List;

public class FirstTwitterApp {

	public static void main(String[] args) throws TwitterException {
		ConfigurationBuilder cf = new ConfigurationBuilder();
		
		cf.setDebugEnabled(true)
			.setOAuthConsumerKey("JQA09OPMOvbMulF7gaXVS8EUu")
			.setOAuthConsumerSecret("0oG1lnxZX2TlfgaDyWOqgpqDxDSCts8ArzszUJHYyVhNg34Icc")
			.setOAuthAccessToken("874572536947720193-18KEvfDS8hCi358EeRg5ETEZ1dzawCw")
			.setOAuthAccessTokenSecret("ZQ7tsQwfYZ3VEmO0atM5bfTYQG5h2SfbQJZgkVVpyEXCp");
		
		TwitterFactory tf = new TwitterFactory(cf.build());
		twitter4j.Twitter twitter = tf.getInstance();
		
		List<Status> status = twitter.getHomeTimeline();
		for(Status st : status){
			System.out.println(st.getUser().getName()+"-------"+st.getText());
		}
	}

}
