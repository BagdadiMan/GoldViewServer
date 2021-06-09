package GoldView.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "saturation")
public class Saturation extends Measurement{

    @Column(name = "value")
    @JsonProperty
    private Integer value;
}
