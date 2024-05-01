package ru.geekbrain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    String filePath = "src/test/resources/protocols/user.txt";

    private String firstName;
    private String lastName;
    private int age;
// region Конструкторы
    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //endregion
    //region Getторы и Setторы

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //endregion

    //region Методы

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append(firstName)
                .append(lastName)
                .append(age)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this,o);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17,37)
                .append(firstName)
                .append(lastName)
                .append(age)
                .toHashCode();
    }

// endregion
}
