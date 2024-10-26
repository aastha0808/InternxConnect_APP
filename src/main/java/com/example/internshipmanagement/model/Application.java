package com.example.internshipmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "internship_id", nullable = false)
    private Internship internship;

    private String status; // e.g., "applied", "accepted", "rejected"
    private LocalDateTime appliedDate = LocalDateTime.now();

    // Getters and Setters
    public int getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }

    public Internship getInternship() {
        return internship;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getAppliedDate() {
        return appliedDate;
    }

    // Setters
    public void setStudent(Student student) {
        this.student = student;
    }

    public void setInternship(Internship internship) {
        this.internship = internship;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

