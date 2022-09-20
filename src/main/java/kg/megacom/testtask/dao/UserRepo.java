package kg.megacom.testtask.dao;

import kg.megacom.testtask.models.entries.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    @Query("select u from User u where userStatus == online")
    List<User> findAllActiveUsers();
}
