package smu.hola.model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "seoul_dong_info")
@Getter
public class Dong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dong_id")
    private Long id;
    @Column(name = "dong_name")
    private String name;
    @Column(name = "dong_total_score")
    private Double totalScore;
    @Column(name = "dong_welfare")
    private Double welfare;
    @Column(name = "dong_medical")
    private Double medical;
    @Column(name = "dong_activity")
    private Double activity;
    @Column(name = "dong_transport")
    private Double transport;
    @Column(name = "dong_convenience")
    private Double convenience;
    @Column(name = "dong_culture")
    private Double culture;
    @Column(name = "dong_greenery")
    private Double greenery;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gu_id",insertable = false, updatable = false)
    private District district;
}
