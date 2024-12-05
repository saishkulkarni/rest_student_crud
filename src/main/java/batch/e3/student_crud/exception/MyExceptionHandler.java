package batch.e3.student_crud.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.resource.NoResourceFoundException;
//
//@RestControllerAdvice
//public class MyExceptionHandler {
//
//	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
//	public ResponseEntity<Object> handle() {
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("error", "Check path its not Proper");
//		return new ResponseEntity<Object>(map, HttpStatus.BAD_REQUEST);
//	}
//
//	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
//	public ResponseEntity<Object> handle1() {
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("error", "Check Method is Not Correct");
//		return new ResponseEntity<Object>(map, HttpStatus.METHOD_NOT_ALLOWED);
//	}
//	
//	@ExceptionHandler(NoResourceFoundException.class)
//	public ResponseEntity<Object> handle2() {
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("error", "Check Path Properly Its not Correct ");
//		return new ResponseEntity<Object>(map, HttpStatus.NOT_FOUND);
//	}
//
//}
