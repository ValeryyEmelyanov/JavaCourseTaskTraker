package com.example.javacoursetasktraker.repository;

import com.example.javacoursetasktraker.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface
TaskRepository extends JpaRepository<Task, Long> {

}
