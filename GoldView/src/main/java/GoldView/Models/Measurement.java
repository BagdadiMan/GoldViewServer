package GoldView.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "measurements")
@Inheritance(strategy = InheritanceType.JOINED)
public class Measurement {

    @Id
    @Column(name = "id")
    @JsonProperty
    private Integer id;

    @Column(name = "measurement_date")
    @JsonProperty
    private Date measurementDate;
}
