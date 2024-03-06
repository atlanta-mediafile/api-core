/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.classes.generated.rest;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class Response<T> implements Serializable {
    
    private final String[] errors;
    private final boolean success;
    private final T data;
    
    public Response(String[] errors, boolean success, T data){
        this.errors = errors;
        this.success = success;
        this.data = data;
    }

    public String[] getErrors() {
        return errors;
    }

    public boolean isSuccess() {
        return success;
    }

    public T getData() {
        return data;
    }
    
}
