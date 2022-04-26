package smu.hola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import smu.hola.model.District;

import java.util.List;

@Repository
public interface DistrictRepository extends JpaRepository<District,Long> {

    District findByName(String name);

    List<District> findByTotalScoreGreaterThan(Double score);

    // 토탈스코어 TOP 5 랭킹 구 조회
    List<District> findTop5ByOrderByTotalScoreDesc();


}
