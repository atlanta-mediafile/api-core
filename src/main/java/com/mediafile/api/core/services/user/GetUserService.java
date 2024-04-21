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
import com.mediafile.classes.generated.soap.GetUserRequest;
import com.mediafile.classes.generated.soap.GetUserResponse;
import com.mediafile.rmi.classes.Response;

/**
 *
 * @author Dego
 */
@Component
public class GetUserService {
    
    @Autowired
    private IUserRepository userService;
    
    public GetUserResponse getUser(GetUserRequest request){
        GetUserResponse response = new GetUserResponse();
        
        Response<User> res = userService.GetUser(request.getTarget().getUserId());
        
        if(!res.isSuccess()){
            response.setErrors(Mapper.getErrors(res.getErrors()));
            response.setSuccess(false);
            return response;
        }
        
        GetUserResponse.Data user = new GetUserResponse.Data();
        
        user.setId(res.getData().getId());
        user.setEmail(res.getData().getEmail());
        user.setFullname(res.getData().getFullName());
        
        response.setSuccess(true);
        response.setData(user);
        response.setErrors(Mapper.getErrors());
       
        return response;
    } 
    
}
