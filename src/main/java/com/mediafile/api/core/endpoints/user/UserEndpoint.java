/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.endpoints.user;

import com.mediafile.api.core.services.rmi.IUserService;
import com.mediafile.classes.generated.soap.Login;
import com.mediafile.classes.generated.soap.LoginResponse;
import com.mediafile.classes.generated.soap.Register;
import com.mediafile.classes.generated.soap.RegisterResponse;
import com.mediafile.rmi.classes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;

/**
 *
 * @author 000430063
 */
@Endpoint
public class UserEndpoint implements IUserEndpoint {

    private final IUserService userService;

    @Autowired
    public UserEndpoint(IUserService userService) {
        this.userService = userService;
    }
    
    @Override
    public LoginResponse login(Login request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public RegisterResponse register(Register request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public User getUser(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
