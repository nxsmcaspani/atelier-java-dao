package fr.wildcodeschool.students.repository;

import fr.wildcodeschool.students.dao.StudentDao;
import fr.wildcodeschool.students.models.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("StudentRepoBdx")
public class StudentRepoBdx implements StudentDao {
    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Toto"));
        students.add(new Student("Titi"));
        students.add(new Student("Tata"));
        return students;
    }
}

