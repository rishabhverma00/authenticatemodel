package com.web.authenticatemodel;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Rishabh
 *
 */
@ControllerAdvice
public class MethodArgumentNotValidExceptionHandler {

	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity<Object> exception(MethodArgumentNotValidException exception) {
		Map<String, String> map = new HashMap<>();
		map.put("message", "Invalid keys");
		return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
	}

}
