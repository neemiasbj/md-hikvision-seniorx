package br.com.thidi.middleware.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/device/minmon")
public class MinMinController {

	@PostMapping(value = "/webhook")
	public ResponseEntity<Object> getDeviceStatus(@RequestBody Object applicationModel) {

		return new ResponseEntity<>(null, HttpStatus.OK);
//		String deviceIpAddress = applicationModel.getDeviceIpAddress();
//		ApiDeviceGenericResponse response = new ApiDeviceGenericResponse(null);
//
//		try {
//			Boolean isDeviceOnlie = socketServerHandler.isDeviceOnline(deviceIpAddress);
//			ApiDeviceGetDeviceStatusModel message = new ApiDeviceGetDeviceStatusModel();
//			message.setDeviceStatus(isDeviceOnlie ? DeviceStatusEnum.UP : DeviceStatusEnum.DOWN);
//			response.setData(message);
//			return new ResponseEntity<>(response, HttpStatus.OK);
//
//		} catch (Exception e) {
//			CLogger.ApiLogDebug("DeviceController", "Error sending API message to client: " + deviceIpAddress + ", message: ApiDeviceGetDeviceStatusModel. Error: " + e.toString());
//			response.setError(true);
//			response.setMessage(e.toString());
//			return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
//		}

	}

}
