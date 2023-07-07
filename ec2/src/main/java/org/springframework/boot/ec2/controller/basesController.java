package org.springframework.boot.ec2.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class basesController {
    
    @GetMapping()
    public ResponseEntity<Object> Index() {
        Map<String, Object> im = new HashMap<>();
        im.put("Codigo", "A20203519");
        im.put("Nombre", "Itamar Jeraldine Herrera Flores");
        return ResponseEntity.ok().body(im);
    }

    @GetMapping("/idat/codigo")
    public ResponseEntity<Object> Code() {
        Map<String, Object> im = new HashMap<>();
        im.put("Codigo", "A20203519");
        return ResponseEntity.ok().body(im);
    }

    @GetMapping("/idat/nombre-completo")
    public ResponseEntity<Object> Name() {
        Map<String, Object> im = new HashMap<>();
        im.put("Nombre", "Itamar Jeraldine Herrera Flores");
        return ResponseEntity.ok().body(im);
    }
}
