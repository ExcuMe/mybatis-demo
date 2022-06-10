CREATE TABLE IF NOT EXISTS `tr_student` (
    `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '学号',
    `student_number` varchar(10) NOT NULL COMMENT '学号',
    `student_name` varchar(20) NOT NULL COMMENT '姓名',
    `height` int(5) NOT NULL COMMENT '身高(cm)',
    `weight` decimal(6,2) NOT NULL COMMENT '体重(kg)',
    `remark` varchar(40) DEFAULT NULL COMMENT '备注',
    `sex` varchar(3) DEFAULT '-1' COMMENT '性别 —— 0:女, 1:男, -1:保密',
    PRIMARY KEY (`student_number`),
    KEY `idx_tr_student_i` (`id`)
    )




