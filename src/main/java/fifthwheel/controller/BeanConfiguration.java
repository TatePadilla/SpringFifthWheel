/**
 * @author Tate - tlpadilla
 * CIS175 - Fall 2023
 * Oct 19, 2023
 */
package fifthwheel.controller;

/**
 * @author Tate
 *
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import fifthwheel.beans.FifthWheel;
import fifthwheel.beans.Manufacturer;

@Configuration
public class BeanConfiguration {
	@Bean
	public FifthWheel fifthwheel() {
		FifthWheel bean = new FifthWheel();
		bean.setModel("Solitude");
		bean.setPrice(70000);
		return bean;
	}
	@Bean
	public Manufacturer manufacturer() {
		Manufacturer bean = new Manufacturer("Winnebago", "Medium class");
		return bean;
	}
}
