package kg.megacom.testtask.services.impl;

import kg.megacom.testtask.dao.UserStatusRepo;
import kg.megacom.testtask.enums.Status;
import kg.megacom.testtask.models.entries.User;
import kg.megacom.testtask.services.UserStatusService;
import sun.security.krb5.internal.ccache.MemoryCredentialsCache;

public class UserStatusServiceImpl implements UserStatusService {

    private final UserStatusRepo userStatusRepo;

    public UserStatusServiceImpl(UserStatusRepo userStatusRepo) {
        this.userStatusRepo = userStatusRepo;
    }

    @Override
    public User save(Status status) {
        MemoryCredentialsCache userStatusService;
        return userStatusService.save(status);
    }

    @Override
    public User update(Status status) {
        return null;
    }

    @Override
    public User getByStatusId(User user) {
        return null;
    }
}
