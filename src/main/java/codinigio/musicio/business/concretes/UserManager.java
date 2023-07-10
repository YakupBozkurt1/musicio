package codinigio.musicio.business.concretes;

import codinigio.musicio.business.Requests.CreateNewUserRequest;
import codinigio.musicio.business.Requests.UpdatePasswordRequest;
import codinigio.musicio.business.abstracts.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserManager implements UserService {


    @Override
    public void add(CreateNewUserRequest createNewUserRequest) {

    }

    @Override
    public void changepassword(UpdatePasswordRequest updatePasswordRequest) {

    }

    @Override
    public void delete(int id) {

    }
}
