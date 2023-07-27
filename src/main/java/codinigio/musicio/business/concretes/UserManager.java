package codinigio.musicio.business.concretes;

import codinigio.musicio.business.Requests.CreateNewUserRequest;
import codinigio.musicio.business.Requests.UpdatePasswordRequest;
import codinigio.musicio.business.abstracts.UserService;
import codinigio.musicio.dataAccess.abstracts.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserManager implements UserService {


    @Autowired
    UserRepository userRepository;




    @Override
    public void add(CreateNewUserRequest createNewUserRequest) {

    }

    @Override
    public void changePassword(UpdatePasswordRequest updatePasswordRequest) {

    }

    @Override
    public void delete(int id) {

    }
}
