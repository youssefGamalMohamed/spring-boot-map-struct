package com.youssef.gamal.springbootwithmappstruct.controllers;

import java.util.NoSuchElementException;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
public class GlobalRestControllerAdivce {
	

	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<?> handleNoSuchElementException(NoSuchElementException noSuchElementException) {
		log.error("handleNoSuchElementException(): " + noSuchElementException.getMessage());
		return ResponseEntity.notFound()
				.build();
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleException(Exception exception) {
		exception.printStackTrace();
		log.error("handleException(): " + exception.getMessage());
		return ResponseEntity.internalServerError()
				.build();
	}

}
