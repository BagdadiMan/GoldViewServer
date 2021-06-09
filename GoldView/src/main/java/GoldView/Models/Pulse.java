package GoldView.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "pulse")
public class Pulse extends Measurement{

    @Column(name = "value")
    @JsonProperty
    private Integer value;
}
