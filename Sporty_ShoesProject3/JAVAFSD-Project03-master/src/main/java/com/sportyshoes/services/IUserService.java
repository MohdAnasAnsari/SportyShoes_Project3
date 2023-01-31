package com.sportyshoes.services;

import com.sportyshoes.exceptions.ResourceNotFound;
import com.sportyshoes.models.Customer;
import com.sportyshoes.models.User;

import java.util.List;

public interface IUserService {

    public Customer insertProductinExistingUserInDB(Customer customer, Long userid, Long productid) throws ResourceNotFound;
    public User insertUserInDB(User user);
    public void updateUserInDB(User user,Long userId) throws ResourceNotFound;
    public List<User> getAllUsers();

}
