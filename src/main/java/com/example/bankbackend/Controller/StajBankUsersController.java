package com.example.bankbackend.Controller;

import com.example.bankbackend.Entity.StajBankUsers;
import com.example.bankbackend.Repository.StajBankUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")

public class StajBankUsersController {

    @Autowired
    private final StajBankUsersRepository stajBankUsersRepository;

    public StajBankUsersController(StajBankUsersRepository stajBankUsersRepository) {this.stajBankUsersRepository = stajBankUsersRepository;}

    @GetMapping("/accounts")
    public List<StajBankUsers> getAllUsers() {
        return  stajBankUsersRepository.findAll();
    }

    @PostMapping("/insertUser")
    public StajBankUsers insertUser(@RequestBody StajBankUsers user) {
        return stajBankUsersRepository.save(user);
    }

    @PutMapping("/updateBalance")
    public String updateBalance(@RequestParam String musteriHesapno, @RequestParam int additionalAmount) {
        Optional<StajBankUsers> userOptional = stajBankUsersRepository.findById(Long.valueOf(musteriHesapno));
        if (userOptional.isPresent()) {
            StajBankUsers user = userOptional.get();
            int currenBalance=user.getMusteriBakiye();
            int newBalance=user.getMusteriBakiye()+additionalAmount;
            user.setMusteriBakiye(newBalance);
            stajBankUsersRepository.save(user);
            return "Balance updated successfully.";
        }
        else{
            return "Fail!User not found.";
        }

    }

    @PutMapping("/withdrawal")
    public String withdrawal(@RequestParam String musteriHesapno, @RequestParam int subtractedAmount) {
        Optional<StajBankUsers> user = stajBankUsersRepository.findById(Long.valueOf(musteriHesapno));
        if (user.isPresent()) {
            StajBankUsers user1 = user.get();
            int currenBalance=user1.getMusteriBakiye();
            if (subtractedAmount > currenBalance) {
                return "Insufficient fund!";
            }
            int newBalance=currenBalance-subtractedAmount;
            user1.setMusteriBakiye(newBalance);
            stajBankUsersRepository.save(user1);
            return "Balance updated successfully.";
        }
        else{
            return "Fail!User not found.";
        }
    }

    @PostMapping("/currentBalance")
    public List<StajBankUsers> currentBalance(@RequestParam String musteriHesapno) {
        List<StajBankUsers> users = new ArrayList<>();
        List<StajBankUsers> allUsers = stajBankUsersRepository.findAll();
        for (StajBankUsers user : allUsers) {
            if (user.getMusteriHesapno().equals(musteriHesapno)) {
                users.add(user);
            }
        }
        return users;
    }

    @DeleteMapping(/"deleteUser")


}
