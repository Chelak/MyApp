package com.myapp.dao.users;

import com.myapp.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by scelac on 3/23/16.
 */
@Repository
public class UserDaoImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory; // session factory object

    public UserDaoImpl() {
    }


    public UserDaoImpl(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }

    private Session getCurrentSession()
    {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<User> findAll() {
        return getCurrentSession().createQuery("from Users").list();
    }

    @Override
    public User findById(Integer userID) {
        return (User)getCurrentSession().get(User.class, userID);
    }

    @Override
    public User findByEmail(String email) {
        return (User)getCurrentSession().createQuery("from User where" +
                " email = :userEmail").setString("userEmail", email).uniqueResult();

    }

    @Override
    public void addUser(User user) {
        getCurrentSession().save(user);
    }

    @Override
    public void editUser(User user, Integer userID) {

        User userToEdit = findById(userID);
        if (userToEdit != null)
        {
            userToEdit.setFirstName(user.getFirstName());
            userToEdit.setLastName(user.getLastName());
            userToEdit.setEmail(user.getEmail());
            userToEdit.setPassword(user.getPassword());
            getCurrentSession().update(userToEdit);
        }

    }

    @Override
    public void removeUser(Integer userID) {
        User userToRemove = findById(userID);

        if (userToRemove !=null)
        {
            getCurrentSession().delete(userToRemove);
        }


    }
}
