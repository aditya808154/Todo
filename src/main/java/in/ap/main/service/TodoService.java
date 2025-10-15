package in.ap.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ap.main.TodoApplication;
import in.ap.main.entity.Todo;
import in.ap.main.repository.TodoRepository;

@Service
public class TodoService {

	@Autowired
	private TodoRepository todoRepository;

	public List<Todo> findAll() {
		return todoRepository.findAll();
	}

	public Todo save(Todo todo) {
		return todoRepository.save(todo);
	}

	public void deleteById(int id) {
		todoRepository.deleteById(id);
	}
}
