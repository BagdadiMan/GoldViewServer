package GoldView.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

	@Id
	@Column(name="firstname")
	@JsonProperty
	private String firstName;
	
	@Column(name="lastname")
	@JsonProperty
	private String lastname;
	
	@Column(name="age")
	@JsonProperty
	private Integer	age;
}
