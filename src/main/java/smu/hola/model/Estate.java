package smu.hola.model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "seoul_real_estate_info")
@Getter
public class Estate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estate_id")
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

    @ManyToOne
    @JoinColumn(name = "dong_id")
    private Dong dong;

}
