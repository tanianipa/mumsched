package edu.mum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.entity.Block;
import edu.mum.entity.Faculty;
import edu.mum.service.BlockService;
import edu.mum.service.FacultyService;

@Controller
@RequestMapping("/facultyController")
//@SessionAttributes("listOfBlocks")
public class FacultyProfileController {

	@Autowired
	private FacultyService facultyService;
	
	@Autowired
	private BlockService blockService;

	// For update faculty
	@RequestMapping(value = "/faculty/update", method = RequestMethod.POST)
	public String updateFaculty(@ModelAttribute("faculty") Faculty f, Model model) {
		System.out.println("======updateFaculty " + f.getPrefferedBlocks());
		System.out.println(f.getPrefferedBlocks().size());
		this.facultyService.updateFaculty(f);
		return "facultyProfile";
		// return "editFacultyProfile";

	}

	// for get profile
	@RequestMapping("/getFacultyById/{userid}")
	public String editPerson(@PathVariable("userid") String id, Model model) {

		System.out.println("in faculty profile controller ...." + id);
		model.addAttribute("faculty", this.facultyService.getFacultyById(id));

		return "facultyProfile";
	}

	@RequestMapping(value = "/edit/{id}")
	public String editProfileform(@PathVariable("id") String id, Model model) {
		Faculty f = this.facultyService.getFacultyById(id);
		model.addAttribute("faculty", f);
		model.addAttribute("listOfBlocks", blockService.getBlocks());
		System.out.println("======editProfileform " + f.getPrefferedBlocks());
		System.out.println("======editProfileform " + f.getPrefferedBlocks().size());
		// this.facultyService.updateFaculty(f);

		// return "redirect:/facultyProfile";
		return "editFacultyProfile";

	}
	
//	@ModelAttribute("listOfBlocks")
//	protected List<Block> getBlockList(@ModelAttribute("listOfBlocks") Block b) {
//			
//		List<Block> blockList = blockService.getBlocks();
//		System.out.println("Test Model Attribute");
//		System.out.println(blockList.size());
//		return blockList;
//	}
}
