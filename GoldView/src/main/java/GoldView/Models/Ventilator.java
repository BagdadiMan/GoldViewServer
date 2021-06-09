package GoldView.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;

@Entity
@Table(name="ventilators")
public class Ventilator {

    @Id
    @Column(name="serial_number")
    @JsonProperty
    private String serialNumber;

    @OneToOne
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    private Department department;

    @OneToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    private Patient patient;
}