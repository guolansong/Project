package com.gls.test.Controller;

import com.gls.test.pojo.Person;
import com.gls.test.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Scanner;

@Controller
@RequestMapping("/ui")
public class TestClass {

    @Resource
    private  PersonService ps ;


    @PostMapping("/end")
    public void go(){
        ps.end();
    }

    @Test
    public void test(){
        Scanner sc = new Scanner(System.in);

        Person person = new Person();
        person.setName("么么");
        person.setAge(123);
        person.setSpecialty("timi");
        person.setTrait("淦");
        String name = person.getName();
        String Specialty = person.getSpecialty();

        System.out.printf("%s 创建success 所学%s ", name,Specialty);
        System.out.println("请开始聊天吧");
        label:
        while(true){
//            String a = sc.next();
//            System.err.println(a);
            String a = "1";
            switch (a){
                case "哈喽":
                    ps.hello();
                    break ;
                case "1":
                    ps.end();
                    break ;
                case "再见":
                    ps.end();
                    break label;
            }
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Person person = new Person();
        person.setName("么么");
        person.setAge(123);
        person.setSpecialty("timi");
        person.setTrait("淦");
        String name = person.getName();
        String Specialty = person.getSpecialty();

        System.out.printf("%s 创建success 所学%s ", name,Specialty);
        System.out.println("请开始聊天吧");
        label:
        while(true){
            String a = sc.next();
            System.err.println(a);
            switch (a){
                case "哈喽":
//                    ps.hello();
                    break ;
                case "1":
//                    ps.end();
                    break ;
                case "再见":
//                    ps.end();
                    break label;
            }
        }
    }
}
