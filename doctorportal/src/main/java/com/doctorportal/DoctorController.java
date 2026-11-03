package com.doctorportal;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DoctorController {
    
	@Autowired
	DoctorDAO doctorDao;
	
	@RequestMapping("/index")
	public String homepage(Model model)
	{  
		List<Doctor> doctorList=doctorDao.getAllDoctorInfo();
		model.addAttribute("list", doctorList);
		return "index";
	}
	
	@RequestMapping(value="/addDoctor", method=RequestMethod.GET)
	public String showDoctorForm(Model model)
	{
		model.addAttribute("doctor", new Doctor());
		return "add-doctor";
	}
	
	@RequestMapping(value="/add" ,method=RequestMethod.POST)
	public String addDoctor( @ModelAttribute("doctor") Doctor doctor)
	{
		doctorDao.insert(doctor);
		return "redirect:/index";
	}
	
	@RequestMapping(value="/deleteDoctor/{id}")
	public String deleteDoctor(@PathVariable("id") int id) {

	    doctorDao.deleteDoctor(id);

	    return "redirect:/index";
	}
	
	@RequestMapping(value="/editDoctor/{id}", method=RequestMethod.GET)
	public String editDoctorForm(@PathVariable("id") int id, Model model) {

	    Doctor doctor = doctorDao.getDoctorById(id);

	    model.addAttribute("doctor", doctor);

	    return "edit-doctor";
	}
	
	@RequestMapping(value="/updateDoctor", method=RequestMethod.POST)
	public String updateDoctor(@ModelAttribute("doctor") Doctor doctor) {

	    doctorDao.updateDoctor(doctor);

	    return "redirect:/index";
	}
}
