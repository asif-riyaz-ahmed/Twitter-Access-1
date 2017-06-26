import twitter4j.conf.ConfigurationBuilder;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.Status;
import java.util.List;
import java.util.Scanner;

public class SecondTwitterApp {
	public static void main(String[] args) throws TwitterException {
		ConfigurationBuilder cf = new ConfigurationBuilder();
		
		cf.setDebugEnabled(true)
			.setOAuthConsumerKey("JQA09OPMOvbMulF7gaXVS8EUu")
			.setOAuthConsumerSecret("0oG1lnxZX2TlfgaDyWOqgpqDxDSCts8ArzszUJHYyVhNg34Icc")
			.setOAuthAccessToken("874572536947720193-18KEvfDS8hCi358EeRg5ETEZ1dzawCw")
			.setOAuthAccessTokenSecret("ZQ7tsQwfYZ3VEmO0atM5bfTYQG5h2SfbQJZgkVVpyEXCp");
		
		TwitterFactory tf = new TwitterFactory(cf.build());
		twitter4j.Twitter twitter = tf.getInstance();
		
		Scanner sc = new Scanner(System.in);
		String user = new String();
		int i = 0;
		System.out.println("Enter Screen Name to see Timeline : ");
		user = sc.next();
		
		sc.close();
		
		List<Status> status = twitter.getUserTimeline(user);
		for(Status st : status){
			if(i<10){
				System.out.println(st.getUser().getName()+"-------"+st.getText());
				i++;
			}
			else
				break;
		}
	}
}