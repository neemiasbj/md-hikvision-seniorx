package br.com.thidi.middleware.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hikvision.minmoe.models.Event;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/device/minmoe")
public class MinMoeController {

	@Autowired
	public MinMoeController() {
	}

	@PostMapping("/webhook")
	public ResponseEntity<String> receiveAndValidate(@Valid @RequestBody Object requestBody) {
		if (requestBody instanceof Map) {
			Map<?, ?> bodyMap = (Map<?, ?>) requestBody;

			if (bodyMap.containsKey("type")) {
				String type = (String) bodyMap.get("type");
				if ("typeA".equals(type)) {
					return new ResponseEntity<>("Processed object of type A", HttpStatus.OK);
				} else if ("typeB".equals(type)) {
					return new ResponseEntity<>("Processed object of type B", HttpStatus.OK);
				}
			}
		} else if (requestBody instanceof Event) {
			return new ResponseEntity<>("Processed CustomClassA object", HttpStatus.OK);
		}

		return new ResponseEntity<>("Unknown object type", HttpStatus.BAD_REQUEST);
	}

}
