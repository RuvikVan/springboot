package com.frame.springboot.model;

import com.frame.springboot.base.BaseEntity;

import javax.persistence.Table;

/**
 * @author van
 */
@Table(name = "`city`")
public class City extends BaseEntity{

    private static final long serialVersionUID = 1L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
