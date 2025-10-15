package in.ap.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ap.main.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

}
