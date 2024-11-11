package br.com.thidi.middleware.controllers;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hikvision.minmoe.models.Event;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/hikvision")
@Tag(name = "Hikvision - MinMoe")
public class HikvisionController {

	@Operation(summary = "Create a new entity with multiple request body examples", description = "This endpoint receives one of the following examples in the request body.", responses = {
			@ApiResponse(responseCode = "200", description = "Event successfully handled"),
			@ApiResponse(responseCode = "400", description = "Invalid input") }, requestBody = @RequestBody(description = "Sample request body", content = @Content(schema = @Schema(implementation = Event.class), examples = @ExampleObject(name = "EventExample", summary = "Example event data", value = "{\n"
					+ "  \"ipAddress\": \"192.168.1.2\",\n" + "  \"portNo\": 8888,\n" + "  \"protocol\": \"HTTP\",\n" + "  \"macAddress\": \"bc:ba:c2:89:f3:76\",\n" + "  \"channelID\": 1,\n" + "  \"dateTime\": \"2022-08-29T18:12:10:03\",\n"
					+ "  \"activePostCount\": 1,\n" + "  \"eventType\": \"AccessControllerEvent\",\n" + "  \"eventState\": \"active\",\n" + "  \"eventDescription\": \"Access Controller Event\",\n" + "  \"AccessControllerEvent\": {\n"
					+ "    \"deviceName\": \"Access Controller\",\n" + "    \"majorEventType\": 5,\n" + "    \"subEventType\": 75,\n" + "    \"name\": \"Person Name\",\n" + "    \"cardReaderKind\": 1,\n" + "    \"cardReaderNo\": 1,\n"
					+ "    \"verifyNo\": 166,\n" + "    \"employeeNoString\": \"12321\",\n" + "    \"serialNo\": 2,\n" + "    \"userType\": \"normal\",\n" + "    \"remoteCheck\": true\n" + "  }\n" + "}"))))
	@PostMapping("/minnoe")
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
