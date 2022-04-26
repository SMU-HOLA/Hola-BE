package smu.hola.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import smu.hola.dto.DistrictDTO;
import smu.hola.dto.RankDTO;
import smu.hola.service.DistrictService;
import smu.hola.service.DongService;
import smu.hola.service.RankingService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class DistrictController {

    private final DistrictService districtService;
    private final DongService dongService;
    private final RankingService rankingService;

    @Autowired
    public DistrictController(DistrictService districtService, DongService dongService, RankingService rankingService) {
        this.districtService = districtService;
        this.dongService = dongService;
        this.rankingService = rankingService;
    }

    @GetMapping("/main")
    public Map<String,List<RankDTO>> getDistrictRanking(){
        Map<String, List<RankDTO>> rankingMap = new HashMap<>();

        rankingMap.put("district-total",rankingService.getDistrictRanking());
        rankingMap.put("dong-total",rankingService.getDongRanking());
        return rankingMap;
    }

    @GetMapping("/district/{districtId}")
    public DistrictDTO getDistrictInfo(@PathVariable Long districtId ){
        return districtService.getDistrictInfo(districtId);
    }
}
