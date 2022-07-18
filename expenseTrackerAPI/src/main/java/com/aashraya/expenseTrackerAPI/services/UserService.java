package com.aashraya.expenseTrackerAPI.services;

import com.aashraya.expenseTrackerAPI.domain.User;
import com.aashraya.expenseTrackerAPI.exceptions.EtAuthException;

public interface UserService {
    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
