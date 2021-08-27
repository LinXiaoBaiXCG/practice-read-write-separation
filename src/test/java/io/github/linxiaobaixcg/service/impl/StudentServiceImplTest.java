package io.github.linxiaobaixcg.service.impl;

import com.google.common.collect.PeekingIterator;
import io.github.linxiaobaixcg.domain.Student;
import io.github.linxiaobaixcg.mapper.StudentMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class StudentServiceImplTest {

    @Autowired(required=true)
    private StudentMapper studentMapper;

    @Test
    public void test() {
        Student student = new Student();
        student.setAge(10);
        student.setName("测试");
        studentMapper.insert(student);
    }
}
