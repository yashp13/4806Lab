package mainmain; /**
 * Created by yashpatel on 1/26/2017.
 */
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "AddressBook", path = "AddressBook")
public interface BuddyRepository extends CrudRepository<BuddyInfo, Integer>{
    List<BuddyInfo> findByName(String name);
}
