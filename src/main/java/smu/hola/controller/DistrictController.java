package smu.hola.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import smu.hola.model.District;
import smu.hola.service.DistrictService;

import java.util.List;

@RestController
public class DistrictController {

    private final DistrictService districtService;

    @Autowired
    public DistrictController(DistrictService districtService) {
        this.districtService = districtService;
    }

    @GetMapping("/main")
    public List<District> getDistrictRanking(){
        return districtService.getTotalScoreRanking();
    }
}
