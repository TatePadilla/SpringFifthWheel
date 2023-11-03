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



@Configuration
public class BeanConfiguration {
	// This just tells spring how to create the entities
	@Bean
	public FifthWheel fifthwheel() {
		FifthWheel fifthwheel = new FifthWheel();
		return fifthwheel;
	}
}
