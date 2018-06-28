package ch.ppe.stream.patients.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import ch.ppe.stream.patients.model.Patient;

@RestController
public class PatientsController {

    @Value("${url.json.server}")
    private String urlJsonServer;
    
	@RequestMapping("/list")
	public List<Patient> list() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<Patient>> rateResponse = restTemplate
				.exchange(urlJsonServer, HttpMethod.GET, null, new ParameterizedTypeReference<List<Patient>>() {});
		return rateResponse.getBody(); 
	}
	
}
