package kg.megacom.testtask.dao;

import kg.megacom.testtask.models.entries.UserStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserStatusRepo extends JpaRepository<UserStatus, Long> {

    @Query("select * from userstatus where status == online")
    @Override
    List<UserStatus> findAll();
}
