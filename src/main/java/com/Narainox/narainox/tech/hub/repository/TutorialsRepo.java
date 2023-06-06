package com.Narainox.narainox.tech.hub.repository;

import com.Narainox.narainox.tech.hub.model.Tutorials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialsRepo extends JpaRepository<Tutorials,Long> {

}
