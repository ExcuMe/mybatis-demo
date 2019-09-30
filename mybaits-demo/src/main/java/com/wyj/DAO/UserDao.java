package com.wyj.DAO;

import com.wyj.entity.User;

import java.util.List;

public interface UserDao {

    public User queryUserById(String  id);

    public List<User> queryUserAll();

    public void CreateUer(User user);

    public void UpdateUser(User user);

    public void DeleteUserById(String id);
}
