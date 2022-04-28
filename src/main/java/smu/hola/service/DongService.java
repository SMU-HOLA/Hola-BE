package smu.hola.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smu.hola.dto.DongDTO;
import smu.hola.repository.DongRepository;

@Service
public class DongService {

    private final DongRepository dongRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public DongService(DongRepository dongRepository, ModelMapper modelMapper) {
        this.dongRepository = dongRepository;
        this.modelMapper = modelMapper;
    }


    public DongDTO getDongInfo(Long dongId){
        return modelMapper.map(dongRepository.getById(dongId),DongDTO.class);
    }
}
