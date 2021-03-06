/**
 * Created by freeemahn on 27.06.15.
 */
package com.freemahn.entity;


import java.io.Serializable;

/**
 * This class represents records in db
 */

public class Account implements Serializable {

    private static final long serialVersionUID = 1L;


    private Integer id;
    private Long value;


    public Account() {
        id = null;
        value = null;
    }

    public Account(int id, Long value) {
        this.id = id;
        this.value = value;
    }


    public Integer getId() {
        return id;
    }

    public Long getValue() {
        return value;
    }

    public void setId(Integer i) {
        id = i;
    }

    public void setValue(Long v) {
        value = v;
    }


}