package uz.sitelabs.car.mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uz.sitelabs.car.model.EntUser;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<EntUser, Long> {

    @Query("select e from EntUser e where e.email = ?1")
    Optional<EntUser> findByEmail(String email);
}
