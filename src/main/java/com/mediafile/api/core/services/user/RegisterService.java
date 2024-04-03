/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.services.user;

import com.mediafile.rmi.classes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mediafile.api.core.repositories.rmi.IUserRepository;
import com.mediafile.api.core.utils.Mapper;
import com.mediafile.classes.generated.soap.Register;
import com.mediafile.classes.generated.soap.RegisterResponse;
import com.mediafile.rmi.classes.Response;
import com.mediafile.rmi.classes.args.RegisterArgs;
import java.util.UUID;

/**
 *
 * @author Dego
 */
@Component
public class RegisterService {
    
    @Autowired
    private IUserRepository userService;
    
    public RegisterResponse register(Register request){
        RegisterResponse response = new RegisterResponse();
        
        Response<String> res = userService.Register(new RegisterArgs(
            UUID.randomUUID().toString(), 
            request.getFullname(), 
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
