package org.thelastride.theend.Courses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<CourseModel,String> {
    Optional<CourseModel> findByCourseId(String courseId);
}
