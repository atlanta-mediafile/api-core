/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mediafile.api.core.repositories.rmi;

import com.mediafile.rmi.classes.Response;
import com.mediafile.rmi.classes.User;
import com.mediafile.rmi.classes.args.LoginArgs;
import com.mediafile.rmi.classes.args.RegisterArgs;

/**
 *
 * @author 000430063
 */
public interface IUserRepository {
    
    /**
     *
     * @param string
     * @return
     */
    public Response<Boolean> Auth(String string);

    /**
     *
     * @param string
     * @return
     */
    public Response<User> GetUser(String string);

    /**
     *
     * @param la
     * @return
     */
    public Response<String> Login(LoginArgs la);

    /**
     *
     * @param ra
     * @return
     */
    public Response<String> Register(RegisterArgs ra);
    
}
