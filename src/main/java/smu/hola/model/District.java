package smu.hola.model;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "seoul_district_info")
@Getter
@Setter
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gu_id")
    private Long id;
    @Column(name = "gu_name")
    private String name;
    @Column(name = "gu_total_score")
    private Double totalScore;
    @Column(name = "gu_welfare")
    private Double welfare;
    @Column(name = "gu_medical")
    private Double medical;
    @Column(name = "gu_activity")
    private Double activity;
    @Column(name = "gu_transport")
    private Double transport;
    @Column(name = "gu_convenience")
    private Double convenience;
    @Column(name = "gu_culture")
    private Double culture;
    @Column(name = "gu_greenery")
    private Double greenery;

    @OneToMany(mappedBy = "district")
    private List<Dong> dongList = new ArrayList<>();

}
