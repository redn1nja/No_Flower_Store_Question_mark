package task2.adapter;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class TestAdapter {
    @Test
    public void testAdapter(){
        FacebookUser userf = new FacebookUser("example@gmail.com", Country.Ukraine, LocalDate.parse("2012-12-12"));
        Client facebookClient = new FacebookClient(userf);
        TwitterUser usert = new TwitterUser("example@gmail.com", "Ukraine", "2012-12-12");
        Client twitterClient = new TwitterClient(usert);
        Assert.assertEquals(facebookClient.getClass().getInterfaces()[0].getSimpleName(), twitterClient.getClass().getInterfaces()[0].getSimpleName());
    }
}
