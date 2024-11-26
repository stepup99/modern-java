package com.example.demo_modern_java;


import org.springframework.boot.SpringApplication;

import java.util.List;
import java.util.Map;

public class VarTypeExample {


    //var in the class properties are not allowed.
    // private var x = "abc";



    public static void main(String[] args) {
        var x = "null";
        System.out.println("var >>>>>>> "+x);
        SpringApplication.run(DemoModernJavaApplication.class, args);
        var list = List.of("adam", "mack");
        System.out.println(list);
        var map = Map.ofEntries(Map.entry("a", List.of("adam", "alex")));
        System.out.println(map);
        for (var name:list){
            System.out.println("name = : " +name);
        }


        map.forEach((var s, var strings)->{
            System.out.println("s : "+s);
            System.out.println("strings : "+strings);
        });
        var tr = transform("mack data");
        System.out.println("transfor >>>>>>>>>>> "+tr);

        var multiLine = """
                This is a
                                        multiline string
                with newlines inside
                """;

        var sql = """
                SLEECT * FROM empleoyee
                            where %s
                """.formatted("jio");
        System.out.println(sql);


        System.out.println(multiLine);
    }

    static String transform(String name) { // var in the function argument is not allowed

        return name.toUpperCase();

    }

}
