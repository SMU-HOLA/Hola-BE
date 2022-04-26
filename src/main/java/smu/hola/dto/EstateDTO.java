package smu.hola.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EstateDTO {
    private Long id;
    private String buildingName;
    private Double deposit;
    private String rentType;
    private Double area;
    private Double manageFee;
    private Integer floor;
    private String estateUrl;
    private String estateImg;
    private Double estateMonthly;

}
