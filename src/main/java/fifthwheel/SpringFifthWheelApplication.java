package fifthwheel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fifthwheel.controller.BeanConfiguration;
import fifthwheel.repository.FifthWheelRepository;
import fifthwheel.beans.Manufacturer;
import fifthwheel.beans.FifthWheel;

import org.springframework.context.ApplicationContext;


import java.util.List;

@SpringBootApplication
public class SpringFifthWheelApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringFifthWheelApplication.class, args);
	}
	
	@Autowired
	FifthWheelRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		FifthWheel f = appContext.getBean("fifthwheel", FifthWheel.class);
		f.setModel("Solitude");
		repo.save(f);
		
		FifthWheel fw2 = new FifthWheel("Reflection", 50000);
		Manufacturer m = new Manufacturer("Grand Design", "High Quality");
		fw2.setManufacturer(m);
		repo.save(fw2);
		
		List<FifthWheel> allFifthWheels = repo.findAll();
		
		for(FifthWheel fws: allFifthWheels) {
			System.out.println(fws.toString());
		}
		
		((AbstractApplicationContext) appContext).close();

		}

}


