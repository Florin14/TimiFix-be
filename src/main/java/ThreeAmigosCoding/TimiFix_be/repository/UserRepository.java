package ThreeAmigosCoding.TimiFix_be.repository;

import ThreeAmigosCoding.TimiFix_be.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
