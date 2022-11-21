package task2.adapter;

import java.time.LocalDate;

public class Login {
    public Client login(String loginMethod){
        if (loginMethod.equals("twitter")){
            return new TwitterClient(new TwitterUser("oles@gmail.com", "UA", "1997-12-22"));
        } else if (loginMethod.equals("facebook")) {
            return new FacebookClient(new FacebookUser("oles@gmail.com", Country.Ukraine, LocalDate.now()));
        }
        return null;
    }
}
