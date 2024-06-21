package com.example.demoSpringBoot.api.controller;

import com.example.demoSpringBoot.api.model.UserModel;
import com.example.demoSpringBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    private UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user")
    public ResponseEntity<?> getUser(@RequestParam String documentType,@RequestParam String documentNumber){
        try {
            if (documentType == null || documentNumber == null || (!documentType.equals("C") && !documentType.equals("P"))) {
                return new ResponseEntity<>("Invalid document type or document number", HttpStatus.BAD_REQUEST);
            }

            UserModel user = userService.getUser(documentType, documentNumber);
            if (user == null) {
                return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
            }

            return new ResponseEntity<>(user, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>("Internal server error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
