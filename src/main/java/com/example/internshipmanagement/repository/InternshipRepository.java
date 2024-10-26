package com.example.internshipmanagement.repository;


import com.example.internshipmanagement.model.Internship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternshipRepository extends JpaRepository<Internship, Integer> {
}
