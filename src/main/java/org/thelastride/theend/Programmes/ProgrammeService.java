package org.thelastride.theend.Programmes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammeService {
    @Autowired
    private ProgrammeRepo programmeRepo;

    public ProgrammeModel saveProgramme(ProgrammeModel programmeModel){
        return programmeRepo.save(programmeModel);
    }
    public void deleteById(String programmeId){
        programmeRepo.deleteById(programmeId);
    }
    public List<ProgrammeModel> getAllProgrammes(){
        return programmeRepo.findAll();
    }
}
