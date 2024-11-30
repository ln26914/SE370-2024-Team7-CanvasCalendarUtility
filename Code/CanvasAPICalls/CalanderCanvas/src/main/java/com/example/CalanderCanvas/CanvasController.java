package com.example.CalanderCanvas;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class CanvasController {

    private final CanvasAPIService canvasService;

    public CanvasController(CanvasAPIService canvasService) {
        this.canvasService = canvasService;
    }

    @GetMapping("/health-check")
    public String getHealthCheck() {
        return "Situation Normal";
    }

    @GetMapping("/courses")
    public JsonNode getCourses() {
        return canvasService.getCourses();
    }

@GetMapping("/grades")
public List<String> getGrades() {
    return canvasService.getGrades();
}
}
