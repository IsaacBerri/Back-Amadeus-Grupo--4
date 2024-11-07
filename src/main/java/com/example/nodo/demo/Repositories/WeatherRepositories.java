package com.example.nodo.demo.Repositories;

import com.example.nodo.demo.Models.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepositories extends JpaRepository<Weather, Integer> {

}