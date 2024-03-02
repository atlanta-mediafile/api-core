/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mediafile.api.core.endpoints.user;

import com.mediafile.classes.generated.soap.Login;
import com.mediafile.classes.generated.soap.LoginResponse;
import com.mediafile.classes.generated.soap.Register;
import com.mediafile.classes.generated.soap.RegisterResponse;

/**
 *
 * @author 000430063
 */
public interface IUserEndpoint {
    public LoginResponse login(Login request);
    public RegisterResponse register(Register request);
}
