package GoldView.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @Column(name = "id")
    @JsonProperty
    private Integer id;

    @Column(name = "name")
    @JsonProperty
    private String name;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;
}
