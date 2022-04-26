package smu.hola.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "seoul_dong_info")
@Getter
@NoArgsConstructor
@AllArgsConstructor
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

    @ManyToOne
    @JoinColumn(name = "gu_id")
    private District district;

    @OneToMany(mappedBy = "dong")
    private List<Estate> estates;

}
