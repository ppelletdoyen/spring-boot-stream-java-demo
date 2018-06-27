package ch.ppe.stream.patients;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PatientsService {
	
    @Value("${url.json.server}")
    private String urlJsonServer;

	public List<Patient> list() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<Patient>> rateResponse = restTemplate
				.exchange(urlJsonServer, HttpMethod.GET, null, new ParameterizedTypeReference<List<Patient>>() {});
		return rateResponse.getBody();
	}
	
}
