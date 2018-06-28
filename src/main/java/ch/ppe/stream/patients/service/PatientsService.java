package ch.ppe.stream.patients.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.ppe.stream.patients.model.Patient;
import ch.ppe.stream.patients.rest.PatientsController;

@Service
public class PatientsService {
	
	@Autowired
	private PatientsController controller;

	public List<Patient> list() {
		return controller.list();
	}
	
}
