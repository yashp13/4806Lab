package mainmain;

/**
 * Created by yashpatel on 2/2/2017.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressbookController {

    @RequestMapping(value = "/create")
    public AddressBook Addressbook(){
        AddressBook ab = new AddressBook();
        return ab;
    }
}
