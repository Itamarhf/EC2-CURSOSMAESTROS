package org.springframework.boot.ec2.controller;

import ec2.prueba.idat.models.Course;
import ec2.prueba.idat.repository.ICourse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("api/curso")
public class courseController {
    private final ICourse _repository;

    public CourseController(ICourse repository) {
        _repository = repository;
    }

    @GetMapping("listar")
    public List<Course> Index() {
        return this._repository.findAll();
    }

    @PostMapping("nuevo")
    public Optional<Course> NewCourse(@RequestBody() Course course) {
        _repository.save(course);
        return this._repository.findById(course.id);
    }

    @DeleteMapping("eliminar/{id}")
    public ResponseEntity<Object> Delete(@PathVariable Integer id) {
        _repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }


    
}
