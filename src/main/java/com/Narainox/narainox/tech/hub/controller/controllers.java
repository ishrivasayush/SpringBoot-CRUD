package com.Narainox.narainox.tech.hub.controller;

import com.Narainox.narainox.tech.hub.model.Tutorials;
import com.Narainox.narainox.tech.hub.service.TutorialsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class controllers {

    @Autowired
    TutorialsServices tutorialsServices;

    @PostMapping("api/tutorials")
    public ResponseEntity<Tutorials> createTutorials(@RequestBody Tutorials tutorials)
    {
        ResponseEntity<Tutorials> responseEntity=new ResponseEntity<>(tutorialsServices.createTutorial(tutorials),HttpStatus.CREATED);
        return responseEntity;
    }

    @GetMapping("api/tutorials")
    public ResponseEntity<List<Tutorials>> getAllTutorials()
    {
        ResponseEntity<List<Tutorials>> responseEntity=new ResponseEntity<>(tutorialsServices.getAllTutorials(),HttpStatus.OK);
        return responseEntity;
    }
    @GetMapping("api/tutorials/{id}")
    public ResponseEntity<Optional<Tutorials>> getTutorials(@PathVariable long id)
    {
        ResponseEntity<Optional<Tutorials>> responseEntity=new ResponseEntity<>(tutorialsServices.getTutorials(id) ,HttpStatus.OK);
        return responseEntity;
    }

    @DeleteMapping("api/tutorials/{id}")
    public ResponseEntity<String> deleteTutorial(@PathVariable Long id)
    {
        ResponseEntity<String> responseEntity=new ResponseEntity<>(tutorialsServices.deleteTutorialById(id),HttpStatus.ACCEPTED);
        return responseEntity;
    }

    @DeleteMapping("api/tutorials")
    public ResponseEntity<String> deleteAllTutroials()
    {
        ResponseEntity<String> responseEntity=new ResponseEntity<>(tutorialsServices.deleteTutorial(),HttpStatus.ACCEPTED);
        return responseEntity;
    }


}
