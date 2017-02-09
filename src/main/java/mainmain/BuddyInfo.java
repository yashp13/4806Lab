package mainmain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by yashpatel on 1/12/2017.
 */
@Entity
public class BuddyInfo {
    private String name;

    @Id
    private int phoneNum;

    public BuddyInfo(){
        name = "";
    }

    public BuddyInfo(String name, int number){
        this.name = name;
        phoneNum = number;
    }

    public void setName(String newname){
        name = newname;
    }

    public String getName(){
        return name;
    }

    public void setPhoneNum(int newnum){
        phoneNum = newnum;
    }

    public int getNumber(){
        return phoneNum;
    }

    @Override
    public String toString(){
        return("Name: " + getName() + " | Phone: " + getNumber());
    }
}
