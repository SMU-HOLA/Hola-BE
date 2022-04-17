package smu.hola.model;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "seoul_district_info", schema = "hola")
@Getter
@Setter
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @OneToMany(mappedBy = "district")
    private List<Dong> dongList = new ArrayList<>();

}
