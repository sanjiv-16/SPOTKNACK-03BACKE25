package com.spk.tskm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spk.tskm.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}