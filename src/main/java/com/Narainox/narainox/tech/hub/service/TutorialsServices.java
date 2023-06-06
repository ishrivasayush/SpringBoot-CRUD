package com.Narainox.narainox.tech.hub.service;
import com.Narainox.narainox.tech.hub.model.Tutorials;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public interface TutorialsServices {
    public Tutorials createTutorial(Tutorials tutorials);
    public Optional<Tutorials> getTutorials(Long id);
    public List<Tutorials> getAllTutorials();
    public String deleteTutorialById(Long id);
    public String deleteTutorial();
}
