package org.thelastride.theend.Students;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<StudentModel,String > {

    Optional<StudentModel> findByHitMail(String hitMail);
}
