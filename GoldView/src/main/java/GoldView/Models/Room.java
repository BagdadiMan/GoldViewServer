package GoldView.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "rooms")
public class Room {

    @Id
    @Column(name = "id")
    @JsonProperty
    private Integer id;

    @Column(name = "number")
    @JsonProperty
    private String number;

    @Column(name = "beds_count")
    @JsonProperty
    private int bedsCount;

    @ManyToOne
    @JoinColumn(name="department_id", nullable=false)
    private Department department;
}
