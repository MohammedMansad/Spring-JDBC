package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("program has started");
       ApplicationContext context=new ClassPathXmlApplicationContext("config.xml"); 
       StudentDao  studentDao=(StudentDao) context.getBean("studentDao");
       
       
       //update 
//       Student student=new Student();
//       student.setId(31);
//       student.setName("maishuf");
//       student.setCity("ksd");
//       int result = studentDao.change(student); 
//       System.out.println("Student Detailed has been  Modified"+result);
       
       //Deleting
       int result = studentDao.delete(214);
       System.out.println(result+" "+"Record has been deleted succesfully");
       
    }
}
