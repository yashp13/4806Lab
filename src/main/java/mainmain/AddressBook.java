package mainmain; /**
 * Created by yashpatel on 1/12/2017.
 */
import javax.persistence.*;
import java.util.*;

@Entity
public class AddressBook {
    private List<BuddyInfo> buddylist;
    private Long id;

    public AddressBook(){
        buddylist = new ArrayList<BuddyInfo>();
    }

    @Id
    @GeneratedValue
    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void addBuddy(BuddyInfo buddy){
        buddylist.add(buddy);
    }

    public void addBuddy(String name, int num){
        buddylist.add(new BuddyInfo(name, num));
    }

    public void removeBuddy(BuddyInfo buddy){
        buddylist.remove(buddy);
    }

    public void removeBuddyByNumber(int num){
        for (BuddyInfo b : buddylist){
            if(b.getNumber() == num)
                buddylist.remove(b);
        }
    }

    public int indexOf(BuddyInfo buddy) {
        return buddylist.indexOf(buddy);
    }

    public BuddyInfo getBuddy (BuddyInfo buddy) {
        return buddylist.get(indexOf(buddy));
    }

    public void print(){
        for(BuddyInfo buddy : buddylist){
            System.out.println(buddy.toString());
        }
    }
    @Override
    public String toString(){
        String s = "";
        for(BuddyInfo buddy : buddylist){
            s += (buddy.toString());
            s += "\n";
            s += "\n";
        }
        return s;
    }

    @OneToMany(cascade = CascadeType.ALL)
    public List<BuddyInfo> getBuddylist(){
        return buddylist;
    }

    public void setBuddylist(List<BuddyInfo> buddylist){
        this.buddylist = buddylist;
    }

    public static void main(String[] args){
        AddressBook ab = new AddressBook();
        BuddyInfo b1 = new BuddyInfo("John", 54656198);
        BuddyInfo b2 = new BuddyInfo("Homer", 87494198);
        ab.addBuddy(b1);
        ab.addBuddy(b2);
        ab.print();
    }
}
