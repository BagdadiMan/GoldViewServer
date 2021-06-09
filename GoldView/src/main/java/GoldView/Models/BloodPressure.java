package GoldView.Models;

        import com.fasterxml.jackson.annotation.JsonProperty;

        import javax.persistence.*;

@Entity
@Table(name = "blood_pressure")
public class BloodPressure extends Measurement{

        @Column(name = "value")
        @JsonProperty
        private Integer value;
}
