/**
 * @author Tate - tlpadilla
 * CIS175 - Fall 2023
 * Oct 19, 2023
 */
package fifthwheel.beans;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author Tate
 *
 */
@Data
@NoArgsConstructor
@Entity
public class FifthWheel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull(message = "Must contain data")
	private String model;
	@NotNull(message = "Must contain data")
	private int price;
}
