package codingwithmitch.com.firebasedirectmessage.models;


public class User {

    private String name;
    private String user_id;

    public User(String name, String user_id) {
        this.name = name;
        this.user_id = user_id;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", user_id='" + user_id + '\'' +
                '}';
    }
}
