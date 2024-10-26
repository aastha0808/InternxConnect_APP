package com.example.internshipmanagement.service;


import com.example.internshipmanagement.model.Internship;
import com.example.internshipmanagement.repository.InternshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternshipService {
    @Autowired
    private InternshipRepository internshipRepository;

    public List<Internship> getAllInternships() {
        return internshipRepository.findAll();
    }

    public Internship getInternshipById(int id) {
        return internshipRepository.findById(id).orElse(null);
    }

    public Internship createInternship(Internship internship) {
        return internshipRepository.save(internship);
    }

    public void deleteInternship(int id) {
        internshipRepository.deleteById(id);
    }
}

