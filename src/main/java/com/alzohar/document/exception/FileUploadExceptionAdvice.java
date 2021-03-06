package com.alzohar.document.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.alzohar.document.entity.PanCardResponseM;

public class FileUploadExceptionAdvice extends ResponseEntityExceptionHandler {
	@ExceptionHandler(MaxUploadSizeExceededException.class)
	public ResponseEntity<PanCardResponseM> handleMaxSizeException(MaxUploadSizeExceededException exc) {
		return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new PanCardResponseM("File too large!"));
	}
}
