package com.wyj.DAO;

import com.wyj.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     * 登录（直接使用注解指定传入参数名称）
     * @param userName
     * @param password
     * @return
     */
    public User login(@Param("userName") String userName,@Param("password")String password);

    /**
     * 根据表名查询用户信息（直接使用注解指定传入参数名称）
     * @param tableName
     * @return
     */
    public List<User> queryUserByTableName(@Param("tableName")String tableName);

    /**
     * 根据Id查询用户信息
     * @param id
     * @return
     */
    public User queryUserById(@Param("id")String id);
    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> queryUserAll();

    /**
     * 新增用户信息
     * @param user
     */
    public void InsertUser(User user);

    /**
     * 根据Id更新用户信息
     * @param user
     */
    public void UpdateUser(User user);

    /**
     * 根据Id删除用户信息
     * @param id
     */
    public void DeleteUserById(String id);




}
