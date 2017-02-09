package mainmain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yashpatel on 2/2/2017.
 */

@RestController
public class BuddyInfoController {
    AddressBook ab = new AddressBook();
    /*BuddyRepository repository;

    @Autowired
    public BuddyInfoController(BuddyRepository repo){
        repository = repo;
    }*/

    @RequestMapping(value = "/add")
    public BuddyInfo addBuddy(@RequestParam(value = "name", defaultValue = "John") String name, @RequestParam(value = "num", required = true) int num){
        BuddyInfo b = new BuddyInfo(name, num);
        ab.addBuddy (b);
        return b;
    }

    @RequestMapping(value = "/remove")
    public void removeBuddy(@RequestParam(value = "num", required = true) int num){
        for (BuddyInfo b : ab.getBuddylist()){
            if(b.getNumber() == num)
                ab.getBuddylist().remove(b);
        }
    }
}
