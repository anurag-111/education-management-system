package com.myProject.Service;

import com.myProject.Entity.Teacher;
import com.myProject.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Optional<Teacher> getTeacherById(Long id) {
        return teacherRepository.findById(id);
    }

    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Teacher updateTeacher(Long id, Teacher updatedTeacher) {
        Optional<Teacher> existingTeacher = teacherRepository.findById(id);

        if (existingTeacher.isPresent()) {
            Teacher teacher = existingTeacher.get();
            teacher.setFirstName(updatedTeacher.getFirstName());
            teacher.setLastName(updatedTeacher.getLastName());
            // You can add more fields to update as needed
            return teacherRepository.save(teacher);
        } else {
            throw new RuntimeException("Teacher not found with id: " + id);
        }
    }

    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }
}
