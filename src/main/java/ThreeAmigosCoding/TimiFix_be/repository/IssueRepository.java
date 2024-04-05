package ThreeAmigosCoding.TimiFix_be.repository;

import ThreeAmigosCoding.TimiFix_be.domain.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IssueRepository extends JpaRepository<Issue,Integer> {

}
