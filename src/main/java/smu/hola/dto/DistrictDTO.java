package smu.hola.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DistrictDTO {
    private Long id;
    private String name;
    private Double totalScore;
    private Double welfare;
    private Double medical;
    private Double activity;
    private Double transport;
    private Double convenience;
    private Double culture;
    private Double greenery;
    private List<DongDTO> dongList;
}


