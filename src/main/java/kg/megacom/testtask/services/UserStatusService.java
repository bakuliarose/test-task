package kg.megacom.testtask.services;

import kg.megacom.testtask.enums.Status;
import kg.megacom.testtask.models.entries.User;

public interface UserStatusService {

    User save(Status status);
    User update(Status status);

    default User getByStatusId(User user) {
        return null;
    }

}
