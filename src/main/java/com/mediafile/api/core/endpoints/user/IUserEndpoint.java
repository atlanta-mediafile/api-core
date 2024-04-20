/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mediafile.api.core.endpoints.user;

import com.mediafile.classes.generated.soap.GetUserRequest;
import com.mediafile.classes.generated.soap.GetUserResponse;
import com.mediafile.classes.generated.soap.LoginRequest;
import com.mediafile.classes.generated.soap.LoginResponse;
import com.mediafile.classes.generated.soap.RegisterRequest;
import com.mediafile.classes.generated.soap.RegisterResponse;

/**
 *
 * @author 000430063
 */
public interface IUserEndpoint {
    
    public LoginResponse login(LoginRequest request);
    
    public RegisterResponse register(RegisterRequest request);
    
    public GetUserResponse getUser(GetUserRequest request); 
    
}
