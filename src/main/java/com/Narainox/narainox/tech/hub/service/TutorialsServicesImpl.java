package com.Narainox.narainox.tech.hub.service;

import com.Narainox.narainox.tech.hub.model.Tutorials;
import com.Narainox.narainox.tech.hub.repository.TutorialsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TutorialsServicesImpl implements TutorialsServices{

    @Autowired
    TutorialsRepo tutorialsRepo;
    @Override
    public Tutorials createTutorial(Tutorials tutorials) {
        Tutorials tutorials1 = tutorialsRepo.save(tutorials);
        return tutorials1;
    }

    public Optional<Tutorials> getTutorials(Long id) {
        return tutorialsRepo.findById(id);
    }

    @Override
    public List<Tutorials> getAllTutorials() {
        return tutorialsRepo.findAll();
    }

    @Override
    public String deleteTutorialById(Long id) {
        tutorialsRepo.deleteById(id);
        return "Deleted Successfully!";
    }

    @Override
    public String deleteTutorial() {
        tutorialsRepo.deleteAll();
        return "Deleted All Successfully!";
    }
}
