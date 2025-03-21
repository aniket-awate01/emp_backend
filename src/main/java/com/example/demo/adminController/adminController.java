package com.example.demo.adminController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.adminModel.adminModel;
import com.example.demo.adminRepository.adminRepository;


@RestController
@RequestMapping("/api/v1/")
public class adminController {
	
	
	@Autowired
	private adminRepository repo;

	
	//get all 
	
	@GetMapping("/admin")
	public List <adminModel> getAllAdmins(){
		return repo.findAll();
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping
	public adminModel createUser(@RequestBody adminModel adminmodel) {
		return repo.save(adminmodel);
	}
}