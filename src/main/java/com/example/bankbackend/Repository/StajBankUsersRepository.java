package com.example.bankbackend.Repository;

import com.example.bankbackend.Entity.StajBankUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StajBankUsersRepository extends JpaRepository<StajBankUsers,Long> {
}
