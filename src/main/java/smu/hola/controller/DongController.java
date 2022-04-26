package smu.hola.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import smu.hola.dto.DongDTO;
import smu.hola.service.DongService;

@RestController
public class DongController {

    private final DongService dongService;

    @Autowired
    public DongController(DongService dongService) {
        this.dongService = dongService;
    }

    @GetMapping("/dong/{dongId}")
    public DongDTO getDongInfo(@PathVariable Long dongId){
        return dongService.getDongInfo(dongId);
    }
}
