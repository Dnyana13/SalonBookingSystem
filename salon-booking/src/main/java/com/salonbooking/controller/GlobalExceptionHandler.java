package com.salonbooking.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class GlobalExceptionHandler {

    // Handles 404 errors when a requested element is not found
    @ExceptionHandler(NoSuchElementException.class)
    public String handleNotFound(NoSuchElementException ex, Model model) {
        model.addAttribute("errorCode", 404);
        model.addAttribute("errorMessage", "The requested page was not found.");
        return "error";  // Redirects to the error.html page
    }

    // Handles general 500 internal server errors
    @ExceptionHandler(Exception.class)
    public String handleInternalServerError(Exception ex, Model model) {
        model.addAttribute("errorCode", 500);
        model.addAttribute("errorMessage", "Something went wrong. Please try again later.");
        return "error";  // Redirects to the error.html page
    }
}
