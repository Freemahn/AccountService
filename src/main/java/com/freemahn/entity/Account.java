/**
 * Created by freeemahn on 27.06.15.
 */
package com.freemahn.entity;


import java.io.Serializable;

public class Account implements Serializable{

    private static final long serialVersionUID = 1L;
    private Integer id;
    private Long value;


    public Account() {
        value = null;
    }

    public Account(Account a) {

        value = a.getValue();
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