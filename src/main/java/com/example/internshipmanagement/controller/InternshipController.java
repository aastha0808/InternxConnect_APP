package com.example.internshipmanagement.controller;


import com.example.internshipmanagement.model.Internship;
import com.example.internshipmanagement.service.InternshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/internships")
public class InternshipController {
    @Autowired
    private InternshipService internshipService;

    @GetMapping
    public List<Internship> getAllInternships() {
        return internshipService.getAllInternships();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Internship> getInternshipById(@PathVariable int id) {
        Internship internship = internshipService.getInternshipById(id);
        if (internship != null) {
            return ResponseEntity.ok(internship);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Internship> createInternship(@RequestBody Internship internship) {
        Internship createdInternship = internshipService.createInternship(internship);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdInternship);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInternship(@PathVariable int id) {
        internshipService.deleteInternship(id);
        return ResponseEntity.noContent().build();
    }
}
