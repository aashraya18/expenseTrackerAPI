package com.aashraya.expenseTrackerAPI.repositories;

import com.aashraya.expenseTrackerAPI.domain.User;
import com.aashraya.expenseTrackerAPI.exceptions.EtAuthException;

public interface UserRepository {
    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
