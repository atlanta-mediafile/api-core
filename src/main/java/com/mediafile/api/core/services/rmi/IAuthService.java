/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mediafile.api.core.services.rmi;

import com.mediafile.rmi.classes.Response;
import com.mediafile.rmi.classes.User;
import com.mediafile.rmi.classes.args.LoginArgs;
import com.mediafile.rmi.classes.args.RegisterArgs;

/**
 *
 * @author 000430063
 */
public interface IAuthService {
    
    public Response<Boolean> Auth(String string);

    public Response<User> GetUser(String string);

    public Response<String> Login(LoginArgs la);

    public Response<String> Register(RegisterArgs ra);
    
}
