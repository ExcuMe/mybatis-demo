package com.wyj.DAOImp;

import com.wyj.DAO.UserDao;
import com.wyj.entity.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImp implements UserDao {
    public SqlSession sqlSession;

    public UserDaoImp(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public User queryUserById(String id) {
        return this.sqlSession.selectOne("UserDao.queryUserById",id);
    }

    public List<User> queryUserAll() {
        return this.sqlSession.selectList("UserDao.queryUserAll");
    }

    public void CreateUer(User user) {
        this.sqlSession.insert("UserDao.CreateUser",user);
    }

    public void UpdateUser(User user) {
        this.sqlSession.update("UserDao.UpdateUser",user);
    }

    public void DeleteUserById(String id) {
        this.sqlSession.delete("UserDao.DeleteUserById",id);
    }
}
