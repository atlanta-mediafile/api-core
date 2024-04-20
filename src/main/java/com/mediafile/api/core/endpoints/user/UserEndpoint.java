/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.endpoints.user;

import com.mediafile.api.core.services.user.GetUserService;
import com.mediafile.api.core.services.user.LoginService;
import com.mediafile.api.core.services.user.RegisterService;
import com.mediafile.api.core.utils.Mapper;
import com.mediafile.classes.generated.soap.EditFileResponse;
import com.mediafile.classes.generated.soap.GetUserRequest;
import com.mediafile.classes.generated.soap.GetUserResponse;
import com.mediafile.classes.generated.soap.LoginRequest;
import com.mediafile.classes.generated.soap.LoginResponse;
import com.mediafile.classes.generated.soap.RegisterRequest;
import com.mediafile.classes.generated.soap.RegisterResponse;
import com.mediafile.rmi.classes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 *
 * @author 000430063
 */
@Endpoint
public class UserEndpoint implements IUserEndpoint {
    
    private static final String NAMESPACE_URI = "http://www.generated.classes.mediafile.com/soap";
    
    @Autowired
    private GetUserService getUserService;
    @Autowired
    private LoginService loginService;
    @Autowired
    private RegisterService registerService;
    
    
    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "Login")
    public LoginResponse login(@RequestPayload LoginRequest request) {
        try{
            return loginService.login(request);
        }catch(Exception ex){
            LoginResponse res = new LoginResponse();
            res.setErrors(Mapper.getErrors(ex.getMessage()));
            return res;
        }
    }

    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "Register")
    public RegisterResponse register(@RequestPayload RegisterRequest request) {
        try{
            return registerService.register(request);
        }catch(Exception ex){
            RegisterResponse res = new RegisterResponse();
            res.setErrors(Mapper.getErrors(ex.getMessage()));
            return res;
        }
    }

    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetUser")
    public GetUserResponse getUser(@RequestPayload GetUserRequest request) {
        try{
            return getUserService.getUser(request);
        }catch(Exception ex){
            GetUserResponse res = new GetUserResponse();
            res.setErrors(Mapper.getErrors(ex.getMessage()));
            return res;
        }
    }
    
}
