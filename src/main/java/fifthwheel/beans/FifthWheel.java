/**
 * @author Tate - tlpadilla
 * CIS175 - Fall 2023
 * Oct 19, 2023
 */
package fifthwheel.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


/**
 * @author Tate
 *
 */
@Entity
public class FifthWheel {
	@Id
	@GeneratedValue
	private long id;
	private String model;
	private int price;
	
	@Autowired
	private Manufacturer manufacturer;
	
	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public FifthWheel() {
		super();
	}
	
	public FifthWheel(String model) {
		this.model = model;
	}
	
	public FifthWheel(String model, int price) {
	
		this.model = model;
		this.price = price;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Contact [id = " + id + ", model = " + model + ", price = " + price + ", manufacturer = " + manufacturer +"]";
	}
}
