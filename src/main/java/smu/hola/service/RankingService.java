package smu.hola.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smu.hola.dto.RankDTO;
import smu.hola.repository.DistrictRepository;
import smu.hola.repository.DongRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RankingService {

    private final DongRepository dongRepository;
    private final DistrictRepository districtRepository;

    @Autowired
    public RankingService(DongRepository dongRepository, DistrictRepository districtRepository) {
        this.dongRepository = dongRepository;
        this.districtRepository = districtRepository;
    }

    public List<RankDTO> getDistrictRanking(){
        return districtRepository.findTop5ByOrderByTotalScoreDesc()
                .stream()
                .map(RankDTO::new)
                .collect(Collectors.toList());
    }

    public List<RankDTO> getDongRanking(){
        return dongRepository.findTop5ByOrderByTotalScoreDesc()
                .stream()
                .map(RankDTO::new)
                .collect(Collectors.toList());
    }

}
