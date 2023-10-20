/**
 * @author Tate - tlpadilla
 * CIS175 - Fall 2023
 * Oct 19, 2023
 */
package fifthwheel.beans;

import jakarta.persistence.Embeddable;

/**
 * @author Tate
 *
 */
@Embeddable
public class Manufacturer {
	private String name;
	private String quality;
	
	public Manufacturer() {
		super();
	}
	
	public Manufacturer(String name) {
		this.name = name;
	}
	
	public Manufacturer(String name, String quality) {
		this.name = name;
		this.quality = quality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}
	@Override
	public String toString() {
	return "Manufacturer [name = " + name + ", quality = " + quality + "]";
	}
}
