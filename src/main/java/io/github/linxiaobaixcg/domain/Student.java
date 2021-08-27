package io.github.linxiaobaixcg.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @TableName student
 */
@TableName(value ="student")
@Data
public class Student implements Serializable {
    /**
     *
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Integer id;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private Integer age;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
