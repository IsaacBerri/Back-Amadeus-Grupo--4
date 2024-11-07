package com.example.nodo.demo.Repositories;

import com.example.nodo.demo.Models.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepositories extends JpaRepository<Activity, Integer> {

}