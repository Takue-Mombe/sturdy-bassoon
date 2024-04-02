package org.thelastride.theend.Lecturers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class LecturerService {

    @Autowired
    private LecturerRepo lecturerRepo;
    public List<LecturerModel> getAllLecturers(){
        return lecturerRepo.findAll();
    }
    public Optional<LecturerModel> getLecturerId(String LecturerId){
        return lecturerRepo.findById(LecturerId);

    }
    public LecturerModel saveLecturer(LecturerModel lecturerModel){
        return   lecturerRepo.save(lecturerModel);
    }
    public void deleteLecturer(@PathVariable String  LecturerId){
        lecturerRepo.deleteById(LecturerId);
    }

}
