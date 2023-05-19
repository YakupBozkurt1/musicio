package codinigio.musicio.business.abstracts;

import codinigio.musicio.business.Requests.CreateNewUserRequest;
import codinigio.musicio.business.Requests.UpdatePasswordRequest;

public interface UserService {

    public void add(CreateNewUserRequest createNewUserRequest);
    public void changepassword(UpdatePasswordRequest updatePasswordRequest);
    public void delete(int id);
}
