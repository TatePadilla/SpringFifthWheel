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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import fifthwheel.beans.*;
import fifthwheel.repository.FifthWheelRepository;

@Controller
public class WebController {
	@Autowired
	FifthWheelRepository repo;

	// Directs to add.html from index
	@GetMapping("/add")
	public String add(Model model) {
		FifthWheel f = new FifthWheel();
		model.addAttribute("newFifthWheel", f);
		return "add";
	}

	// Method used in add.html template
	@PostMapping("/add")
	public String add(@ModelAttribute FifthWheel f, Model model) {
		repo.save(f);
		return viewAll(model);
	}

	@GetMapping("/edit/{id}")
	public String showUpdateFifthWheel(@PathVariable("id") long id, Model model) {
		FifthWheel f = repo.findById(id).orElse(null);
		model.addAttribute("newFifthWheel", f);
		return "add.html";
	}

	@PostMapping("/update/{id}")
	public String getUpdate(FifthWheel f, Model model) {
		repo.save(f);
		return viewAll(model);
	}

	@GetMapping("/delete/{id}")
	public String deleteFifthWheel(@PathVariable("id") long id, Model model) {
		FifthWheel f = repo.findById(id).orElse(null);
		System.out.println(f);
		repo.delete(f);
		return viewAll(model);
	}

	@GetMapping({ "/", "viewAll" })
	public String viewAll(Model model) {
		if (repo.findAll().isEmpty()) {
			return add(model);
		}
		model.addAttribute("fifth_wheel", repo.findAll());
		return "results";
	}
}
