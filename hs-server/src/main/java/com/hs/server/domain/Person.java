package com.hs.server.domain;

/**
 * description:${todo} <br/>
 * Date:     2017/7/4 17:16<br/>
 *
 * @author work_tl
 * @see
 * @since JDK 1.8
 */
public class Person {
    private String name;
    private Integer age;

    public Person() {
        super();
    }

    public Person(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
