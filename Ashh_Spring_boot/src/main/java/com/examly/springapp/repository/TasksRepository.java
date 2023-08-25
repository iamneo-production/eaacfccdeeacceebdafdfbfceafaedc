package com.examly.springapp.repository;

import com.examly.springapp.bean.Task;

import org.springframework.data.repository.CrudRepository;

public interface TasksRepository extends CrudRepository<Task, String> {
    
}
