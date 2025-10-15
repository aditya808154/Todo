package in.ap.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ap.main.entity.Todo;
import in.ap.main.service.TodoService;

@RestController
@RequestMapping("/api/todos")
@CrossOrigin(origins = "http://localhost:5173")
public class TodoController {

	@Autowired
	private TodoService todoService;
	
	@GetMapping
	public List<Todo> getAllTodos(){
		return todoService.findAll();
	}
	
	@PostMapping
	public Todo createTodo(@RequestBody Todo todo) {
		return todoService.save(todo);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTodo(@PathVariable int id) {
		todoService.deleteById(id);
	}
}
