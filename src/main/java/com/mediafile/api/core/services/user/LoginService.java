/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.services.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mediafile.api.core.repositories.rmi.IUserRepository;
import com.mediafile.api.core.utils.Mapper;
import com.mediafile.classes.generated.soap.LoginRequest;
import com.mediafile.classes.generated.soap.LoginResponse;
import com.mediafile.rmi.classes.Response;
import com.mediafile.rmi.classes.args.LoginArgs;

/**
 *
 * @author Dego
 */
@Component
public class LoginService {
    
    @Autowired
    private IUserRepository userService;
    
    public LoginResponse login(LoginRequest request){
        LoginResponse response = new LoginResponse();
        
        Response<String> res = userService.Login(new LoginArgs(
        request.getEmail(), 
        request.getPassword())
        );
        
        if(!res.isSuccess()){
            response.setErrors(Mapper.getErrors(res.getErrors()));
            response.setSuccess(false);
            return response;
        }
        
        response.setSuccess(true);
        response.setData(res.getData());
       
        return response;
    } 
    
}
