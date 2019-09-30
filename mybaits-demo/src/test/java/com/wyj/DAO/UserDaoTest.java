package com.wyj.DAO;

import com.wyj.DAOImp.UserDaoImp;
import com.wyj.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class UserDaoTest {
    public UserDao userDao;
    public SqlSession sqlSession;

    @Before
    public void setUp() throws Exception {
        String resource = "mybatis-config.xml";
        // 读取配置文件
        InputStream is = Resources.getResourceAsStream(resource);
        // 构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        // 获取sqlSession
        sqlSession = sqlSessionFactory.openSession();
        this.userDao = new UserDaoImp(sqlSession);
    }

    @Test
    public void queryUserById() {
        System.out.println(this.userDao.queryUserById("3"));
    }

    @Test
    public void queryUserAll() {
        List<User> userList = this.userDao.queryUserAll();
        for (User user :userList) {
            System.out.println(user);
        }
    }

    @Test
    public void createUer() {
        User user = new User();
        user.setId("4");
        user.setAge(22);
        user.setBirthday(new Date("1997/12/31"));
        user.setName("吴玉杰");
        user.setSex("男");
        user.setUserName("wyj");
        user.setPassword("123456");
        this.userDao.CreateUer(user);
        this.sqlSession.commit();
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setBirthday(new Date());
        user.setName("WH");
        user.setPassword("654321");
        user.setId("1");
        user.setSex("女");
        this.userDao.UpdateUser(user);
        this.sqlSession.commit();
    }

    @Test
    public void deleteUserById() {
        this.userDao.DeleteUserById("2");
        this.sqlSession.commit();
    }
}