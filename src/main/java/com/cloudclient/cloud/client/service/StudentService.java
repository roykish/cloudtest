package com.cloudclient.cloud.client.service;

import com.cloudclient.cloud.client.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentService {
    Student getByStudentId(int studentId);
    Student getByStudentName(String student);
    boolean save(Student student);
}
