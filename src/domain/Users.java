package domain;

/**
 * Created by eugene.iarosh on 3/24/2017.
 */
public class Users {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Users(String name) {
        this.name = name;
    }

    public Users(){
    }
}
