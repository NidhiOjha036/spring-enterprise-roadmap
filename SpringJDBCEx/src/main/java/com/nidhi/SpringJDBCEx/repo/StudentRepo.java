package com.nidhi.SpringJDBCEx.repo;

import com.nidhi.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {
        String sql = "insert into student (rollno,name,marks) values (?,?,?)";
        int rows = jdbc.update(sql, s.getRollNo(), s.getRollNo(), s.getMarks());
        System.out.println(rows + " affected");

    }

    //with lambda expression
    public List<Student> findAll() {

        String sql="select * from student";
        return jdbc.query(sql,(rs,rowNum) ->
        {
            Student s=new Student();
            s.setRollNo(rs.getInt("rollno"));
            s.setName(rs.getString("name"));
            s.setMarks(rs.getInt("marks"));
            return s;

        });
    }



    //without lambda expression

    /*
     * public List<Student> findAll() {
     *
     * String sql="select * from student"; RowMapper<Student> mapper=new
     * RowMapper<Student>() {
     *
     * @Override public Student mapRow(ResultSet rs, int rowNum) throws SQLException
     * { Student s=new Student(); s.setRollNo(rs.getInt("rollno"));
     * s.setName(rs.getString("name")); s.setMarks(rs.getInt("marks")); return s; }
     * }; return jdbc.query(sql, mapper); }
     */



}
