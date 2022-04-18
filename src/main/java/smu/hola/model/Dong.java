package smu.hola.model;

import javax.persistence.*;

@Entity
@Table(name = "seoul_dong_info", schema = "hola")
public class Dong {

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

    @ManyToOne(fetch = FetchType.LAZY)
    private District district;
}
