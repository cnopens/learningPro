package com.learningpro.domain;

import java.io.Serializable;

public class Test implements Serializable {


    public Test() {
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.id
     *
     * @mbggenerated Wed Nov 13 15:58:24 CST 2013
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.name
     *
     * @mbggenerated Wed Nov 13 15:58:24 CST 2013
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.type
     *
     * @mbggenerated Wed Nov 13 15:58:24 CST 2013
     */
    private String type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test.id
     *
     * @return the value of test.id
     *
     * @mbggenerated Wed Nov 13 15:58:24 CST 2013
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test.id
     *
     * @param id the value for test.id
     *
     * @mbggenerated Wed Nov 13 15:58:24 CST 2013
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test.name
     *
     * @return the value of test.name
     *
     * @mbggenerated Wed Nov 13 15:58:24 CST 2013
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test.name
     *
     * @param name the value for test.name
     *
     * @mbggenerated Wed Nov 13 15:58:24 CST 2013
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test.type
     *
     * @return the value of test.type
     *
     * @mbggenerated Wed Nov 13 15:58:24 CST 2013
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test.type
     *
     * @param type the value for test.type
     *
     * @mbggenerated Wed Nov 13 15:58:24 CST 2013
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }


    public Test(String name, String type) {
        this.name = name;
        this.type = type;
    }
}