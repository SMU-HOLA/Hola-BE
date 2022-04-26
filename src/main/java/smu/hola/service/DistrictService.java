package smu.hola.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smu.hola.dto.DistrictDTO;
import smu.hola.dto.RankDTO;
import smu.hola.model.District;
import smu.hola.repository.DistrictRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class DistrictService {

    private final DistrictRepository districtRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public DistrictService(DistrictRepository districtRepository, ModelMapper modelMapper) {
        this.districtRepository = districtRepository;
        this.modelMapper = modelMapper;
    }

    public DistrictDTO getDistrictInfo(Long districtId){
        District district = districtRepository.getById(districtId);
        return modelMapper.map(district, DistrictDTO.class);
    }

}
