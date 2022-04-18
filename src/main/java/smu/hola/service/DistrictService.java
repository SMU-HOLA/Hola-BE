package smu.hola.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smu.hola.model.District;
import smu.hola.repository.DistrictRepository;

import java.util.List;

@Service
public class DistrictService {

    private final DistrictRepository districtRepository;

    @Autowired
    public DistrictService(DistrictRepository districtRepository) {
        this.districtRepository = districtRepository;
    }

    public List<District> getTotalScoreRanking(){
        return districtRepository.findTotalScoreTopFive();
    }

    public District getDistrictInfo(Long districtId){
        return districtRepository.getById(districtId);
    }

}
