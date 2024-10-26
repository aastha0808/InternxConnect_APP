package com.example.internshipmanagement.repository;

import com.example.internshipmanagement.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}
