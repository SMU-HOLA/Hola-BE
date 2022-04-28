package smu.hola.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import smu.hola.model.District;
import smu.hola.model.Dong;
import smu.hola.model.Estate;

@Getter
@Setter
@AllArgsConstructor
public class RankDTO {

    public Type type;
    public Long id;
    public String name;
    public Double score;

    public enum Type {
        DISTRICT, DONG , ESTATE
    }

    public RankDTO(District district) {
        this.type = Type.DISTRICT;
        this.id = district.getId();
        this.name = district.getName();
        this.score = district.getTotalScore();
    }

    public RankDTO(Dong dong){
        this.type = Type.DONG;
        this.id = dong.getId();
        this.name = dong.getName();
        this.score = dong.getTotalScore();
    }

    public RankDTO(Estate estate){
        this.type = Type.ESTATE;
        this.id = estate.getId();
        this.name = estate.getBuildingName();
        //@TODO 부동산 별 좋아요 혹은 조회수로 점수 대체
       // this.score = estate.
    }
}
