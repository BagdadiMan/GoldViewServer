package GoldView.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @Column(name = "id")
    @JsonProperty
    private String id;

    @Column(name = "first_name")
    @JsonProperty
    private String firstName;

    @Column(name = "last_name")
    @JsonProperty
    private String lastName;

    @Column(name = "birth_date")
    @JsonProperty
    private Date birthDate;

    @Column(name = "contact_name")
    @JsonProperty
    private String contactName;

    @Column(name = "contact_phone_number")
    @JsonProperty
    private String contactPhoneNumber;

    @Column(name = "reception_date")
    @JsonProperty
    private Date receptionDate;

    @Column(name = "release_date")
    @JsonProperty
    private Date releaseDate;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    public Room getRoom() {
        return room;
    }

    public String getId() {
        return id;
    }

    public void setDateToday() {
        this.releaseDate = new Date();
    }
}
