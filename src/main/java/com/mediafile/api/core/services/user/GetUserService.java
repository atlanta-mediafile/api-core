/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.services.user;

import com.mediafile.api.core.repositories.grpc.IFileService;
import com.mediafile.api.core.repositories.rest.IMetadataService;
import com.mediafile.api.core.repositories.rmi.IUserService;
import com.mediafile.rmi.classes.Response;
import com.mediafile.rmi.classes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Dego
 */
@Component
public class GetUserService {
    
    @Autowired
    private IUserService userService;
    
    public User getUser(){
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    } 
    
}
