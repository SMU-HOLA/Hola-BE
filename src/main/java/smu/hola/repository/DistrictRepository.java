package smu.hola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import smu.hola.model.District;

import java.util.List;
import java.util.Optional;

@Repository
public interface DistrictRepository extends JpaRepository<District,Long> {

    District findByName(String name);

    List<District> findByTotalScoreGreaterThan(Double score);

    // 토탈스코어 TOP 5 랭킹 구 조회
    @Query(value = "select dtr from District dtr " +
            "order by dtr.totalScore DESC LIMIT 5", nativeQuery = true)
    List<District> findTotalScoreTopFive();
}
