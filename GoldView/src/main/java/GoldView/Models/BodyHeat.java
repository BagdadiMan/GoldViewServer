package GoldView.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "body_heat")
public class BodyHeat extends Measurement{

    @Column(name = "value")
    @JsonProperty
    private double value;
}
