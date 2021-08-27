package io.github.linxiaobaixcg.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.linxiaobaixcg.domain.Student;
import io.github.linxiaobaixcg.service.StudentService;
import io.github.linxiaobaixcg.mapper.StudentMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student>
    implements StudentService{

}




