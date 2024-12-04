package batch.e3.student_crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import batch.e3.student_crud.dto.Student;
import batch.e3.student_crud.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	StudentService service;

	@PostMapping("/students")
	public ResponseEntity<Object> saveStudent(@RequestBody Student student){
		return service.save(student);
	}
	
	@GetMapping("/students")
	public ResponseEntity<Object> fetchStudents(){
		return service.fetchAll();
	}
	
	@GetMapping("/students/{id}")
	public ResponseEntity<Object> fetchById(@PathVariable int id){
		return service.fetchById(id);
	}
	
	@GetMapping("/students/name/{name}")
	public ResponseEntity<Object> fetchByName(@PathVariable String name){
		return service.fetchByName(name);
	}
	
	@GetMapping("/students/mobile/{mobile}")
	public ResponseEntity<Object> fetchByMobile(@PathVariable long mobile){
		return service.fetchByMobile(mobile);
	}
	
	@GetMapping("/students/result/{result}")
	public ResponseEntity<Object> fetchByResult(@PathVariable String result){
		return service.fetchByResult(result);
	}
}
