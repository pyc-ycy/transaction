//IntelliJ IDEA
//transaction
//Person
//2020/2/11
// Author:御承扬
//E-mail:2923616405@qq.com

package com.pyc.transaction.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer age;
    private String address;

    public Person(){
        super();
    }
    public Person(Long id,String name, Integer age, String address){
        super();
        this.id=id;
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
