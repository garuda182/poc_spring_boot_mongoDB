package com.example.demoMongoDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void save(String age, String gender, String maritalStatus, String occupation, String monthlyIncome, String educationalQualifications, String familySize, String latitude, String longitude, String pinCode, String output, String feedback) {

        Cliente cliente = new Cliente(age, gender, maritalStatus, occupation, monthlyIncome, educationalQualifications, familySize, latitude, longitude, pinCode, output, feedback);

        this.clienteRepository.insert(cliente);
    }

}
