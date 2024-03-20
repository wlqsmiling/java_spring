/*
 * @Date: 2024-03-07 10:31:43
 * @LastEditors: liqunwu wlqsmiling@gmail.com
 * @LastEditTime: 2024-03-20 15:43:51
 * @FilePath: \java_spring\src\main\java\com\test\demo\controller\HelloController.java
 */
package com.test.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.test.demo.Model.Student;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class HelloController {

    public String test_mybatis(){
        String resource = "mapper/conf.xml";
        try{
            Reader reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session = sqlSessionFactory.openSession();
            
            String statement = "Jdbc.studentMapper.getStudent";

            Student student = session.selectOne(statement,"lisi");

            return student.toString();
        } catch(Exception e) {
            System.out.println(e.toString());
        }

        return "failed";
    }


     @GetMapping("/test")
     public String getMethodName() {
        //  return new String("Hello World");

        return test_mybatis();
     }
}
