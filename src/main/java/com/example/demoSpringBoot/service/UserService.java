package com.example.demoSpringBoot.service;

import com.example.demoSpringBoot.api.model.UserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    private List <UserModel> users;

    public UserService(){
        users = new ArrayList<>();
        users.add(new UserModel(1, "C", "23445322", "Juan", "David", "Pérez", "Gómez", "+57 312 3456789", "Calle 10 # 12-34", "Bogotá"));
        users.add(new UserModel(2, "C", "987654321", "Maria", "", "Gómez", "Rodríguez", "+57 310 1234567", "Avenida Siempreviva # 15-67", "Medellín"));
        users.add(new UserModel(3, "P", "345678901", "Pedro", null, "López", "", "+57 311 7654321", "Carrera 7 # 48-29", "Cali"));
        users.add(new UserModel(4, "P", "234567890", "Ana", "Carolina", "Martínez", "Flores", "+57 312 9876543", "Diagonal 10 # 34-12", "Barranquilla"));
        users.add(new UserModel(5, "C", "567890123", "Carlos", "", "Ramírez", "", "+57 313 1234567", "Calle 50 # 21-14", "Cartagena"));

    }

    public UserModel getUser(String documentType, String documentNumber){
        logger.info("Fetching user with documentType: {} and documentNumber: {}", documentType, documentNumber);
        for (UserModel user : users) {
            if (user.getDocumentType().equals(documentType) && user.getDocumentNumber().equals(documentNumber)) {
                logger.info("User found: {}", user);
                return user;
            }
        }
        logger.warn("User not found with documentType: {} and documentNumber: {}", documentType, documentNumber);
        return null;
    }
}
