package GoldView.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hospitals")
public class Hospital {

	@Id
	@Column(name="id")
	@JsonProperty
	private Integer id;
	
	@Column(name="name")
	@JsonProperty
	private String name;
}
