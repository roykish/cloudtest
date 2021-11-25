package com.cloudclient.cloud.client.service;

import com.cloudclient.cloud.client.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService {
    @Override
    public Student getByStudentId(int studentId) {
        Student s = new Student();
        s.setStudentId(studentId);
        s.setStudentName("name" + studentId);
        s.setStudentMobile("123456789");
        return s;
    }

    @Override
    public Student getByStudentName(String studentName) {
        Student s = new Student();
        s.setStudentId(2);
        s.setStudentName(studentName);
        s.setStudentMobile("123456789");
        return s;
    }

    @Override
    public boolean save(Student student) {
        System.out.println("id" + student.getStudentId()
                + ",name " + student.getStudentName()
                + ",mobileNumber " + student.getStudentMobile());
        return false;
    }
}
