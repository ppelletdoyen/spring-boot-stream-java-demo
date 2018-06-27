package ch.ppe.stream.patients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientsController {
	
	@Autowired
	private PatientsService service;

	@RequestMapping("/list")
	public String list() {
		return service.list().toString();  
	}
	
}
