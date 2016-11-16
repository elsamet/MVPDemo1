package Model;

/**
 * Created by Mahmoud.Ramadan on 11/15/2016.
 */

public class User {

    private String fullName;
    private String email;

    public void setFullName(String fullName){
        this.fullName=fullName;
    }

    public void setEmail(String email){
        this.email=email;
    }

    @Override
    public String toString() {
        return "FullName="+fullName+"Email="+email;
    }
}
