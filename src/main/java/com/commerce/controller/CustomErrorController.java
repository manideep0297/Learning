package com.commerce.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public ResponseEntity<String> handleError(HttpServletRequest request) {
        return ResponseEntity.badRequest().body("An error occurred.");
    }

//    @RequestMapping("/error")
//    public ResponseEntity<Map<String, Object>> handleError(HttpServletRequest request) {
//        Map<String, Object> errorDetails = new HashMap<>();
//        errorDetails.put("status", request.getAttribute("jakarta.servlet.error.status_code"));
//        errorDetails.put("message", "Something went wrong!");
//        return ResponseEntity.status((Integer) errorDetails.get("status")).body(errorDetails);
//    }

}
