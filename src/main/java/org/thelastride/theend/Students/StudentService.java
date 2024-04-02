package org.thelastride.theend.Students;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public StudentModel saveStudents(StudentModel studentModel){
        return studentRepo.save(studentModel);
    }
    public void deleteStudent(@PathVariable String hitMail)
    {
        studentRepo.deleteById(hitMail);
    }
    public List<StudentModel>findAll(){
        return studentRepo.findAll();
    }
    public Optional<StudentModel> findByHitMail(String hitmail){
        return studentRepo.findByHitMail(hitmail);
    }

}
