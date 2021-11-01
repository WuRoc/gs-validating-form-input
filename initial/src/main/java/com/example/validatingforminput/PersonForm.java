package com.example.validatingforminput;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @ClassName PersonForm
 * @Description TODO
 * @Author XiaoShuMu
 * @Version 1.0
 * @Create 2021-11-01 09:45
 * @Blog https://www.cnblogs.com/WLCYSYS/
 **/
public class PersonForm {
    @NotNull
    @Size(min = 2, max = 30)
    public String name;

    @NotNull
    @Min(18)
    private Integer age;

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + this.name + '\'' +
                ", Age=" + this.age +
                '}';
    }
}
