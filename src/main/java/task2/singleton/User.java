package task2.singleton;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String email;
    private int age;

    public void save(){
        DBConnection dbConnection = DBConnection.getInstance();
        dbConnection.executeQuery("insert into user (email, name, age) values ('o@gmail.com', 'ostap', 18)");
    }
}
