package com.github.hcsp.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    // 请编写一个方法，对传入的List<User>进行如下处理：
    // 返回一个从部门名到这个部门的所有用户的映射。同一个部门的用户按照年龄进行从小到大排序。
    // 例如，传入的users是[{name=张三, department=技术部, age=40 }, {name=李四, department=技术部, age=30 },
    // {name=王五, department=市场部, age=40 }]
    // 返回如下映射：
    //    技术部 -> [{name=李四, department=技术部, age=30 }, {name=张三, department=技术部, age=40 }]
    //    市场部 -> [{name=王五, department=市场部, age=40 }]
    public static Map<String, List<User>> collect(List<User> users) {
        /*
            做映射和排序
                1. 映射，字符串加一个用户的 list 的 Map，
                    其实，题目只有两个部门，一个市场部一个技术部，
                        只需要提取 user 的名字，分别加入到不同的 Map 中的 list
                2. 其中每插入一个用户，要做一个年龄的比较（重写比较的方法）,
              m      不一定，排序等于有序的序列，可以利用 TreeSet ？
         */
        Map<String,List<User>> mapUser = new Map

        for (User user :
                users) {
            if (user.getDepartment() == "技术部") {

            } else {

            }
        }


    }

    public static void main(String[] args) {
        System.out.println(
                collect(
                        Arrays.asList(
                                new User(1, "张三", 40, "技术部"),
                                new User(2, "李四", 30, "技术部"),
                                new User(3, "王五", 40, "市场部"))));
    }
}
