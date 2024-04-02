package org.thelastride.theend.Lecturers;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LecturerRepo extends JpaRepository<LecturerModel,Long> {

    Optional<LecturerModel> findBylecturerId(String lectureId);
}
