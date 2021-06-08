package fr.wildcodeschool.students.repository;
import fr.wildcodeschool.students.dao.StudentDao;
import fr.wildcodeschool.students.models.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("StudentRepoTls")
public class StudentRepoTls implements StudentDao {
    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bernard"));
        students.add(new Student("Hoagie"));
        students.add(new Student("Laverne"));
        return students;
    }
}
