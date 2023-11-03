/**
 * @author Tate - tlpadilla
 * CIS175 - Fall 2023
 * Nov 1, 2023
 */
package fifthwheel.controller;

/**
 * @author Tate
 *
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import fifthwheel.beans.*;
import fifthwheel.repository.FifthWheelRepository;

@Controller
public class WebController {
	@Autowired
	FifthWheelRepository repo;
	
	@GetMapping("/")
	public String getForm(FifthWheel fifthwheel) {
		return "index";
	}
	
	// Directs to add.html from index
	@GetMapping("/add.html")
	public String getAdd(FifthWheel fifthwheel) {
		return "add";
	}
	
	// Method used in add.html template
	@PostMapping("/saveFifthWheel")
	public String saveFifthWheelDetails(FifthWheel fifthwheel, Errors errors, Model model) {
		if (null != errors && errors.getErrorCount() > 0) {
			return "index";
		} else {
			repo.save(fifthwheel);
			model.addAttribute("successMsg", "Added successfully!");
			return "index";
		}
	}
	
	@PostMapping("/update.html")
	public String getUpdate(FifthWheel fifthwheel) {
		return "update";
	}
	
	@GetMapping("/delete.html")
	public String deleteFifthwheel(FifthWheel fifthwheel) {
		return "delete";
	}
}
