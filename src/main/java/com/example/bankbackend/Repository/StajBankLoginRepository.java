package com.example.bankbackend.Repository;

import com.example.bankbackend.Entity.StajBankLoginUsers;
import com.example.bankbackend.Entity.StajBankUsers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StajBankLoginRepository extends JpaRepository <StajBankLoginUsers,Long> {
    List<StajBankLoginUsers> findByUsernameAndPassword(String username, String password);
}
