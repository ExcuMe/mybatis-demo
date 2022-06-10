package com.wyj.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tr_student")
public class StudentDO {

    private Long id;

    private String studentNumber;

    private String studentName;

    private Integer height;

    private Integer weight;

    private String remark;

    private String sex;
}
