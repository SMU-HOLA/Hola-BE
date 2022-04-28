package smu.hola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import smu.hola.model.Dong;

import java.util.List;

@Repository
public interface DongRepository extends JpaRepository<Dong,Long> {

    Dong findByName(String name);

    List<Dong> findTop5ByOrderByTotalScoreDesc();

}
