package com.wyj;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.wyj.bean.StudentDO;
import com.wyj.dao.StudentMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class StudentMapperTest {

    @Autowired
    public StudentMapper studentMapper;

    @Test
    public void TestStudentMapper(){
        try {
            List<StudentDO> list = studentMapper.selectList(Wrappers.emptyWrapper());
            for(StudentDO studentDO : list){
                System.out.println(studentDO.toString());
            }
        } catch (Exception e){
            log.error("failed:{}", e.getMessage());
        }

    }

}
