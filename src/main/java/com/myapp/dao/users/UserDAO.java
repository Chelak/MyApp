package com.myapp.dao.users;

import com.myapp.domain.User;

import java.util.List;

/**
 * Created by scelac on 3/23/16.
 */
public interface UserDAO
{
    public List<User> findAll();
    public User findById(Integer userID);
    public User findByEmail(String email);
    public void addUser(User user);
    public void editUser(User user, Integer userID);
    public void removeUser(Integer userID);

}
