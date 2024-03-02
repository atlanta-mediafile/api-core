/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.services.rmi;

import com.mediafile.rmi.classes.Response;
import com.mediafile.rmi.classes.User;
import com.mediafile.rmi.classes.args.LoginArgs;
import com.mediafile.rmi.classes.args.RegisterArgs;
import com.mediafile.rmi.interfaces.IAuthProvider;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


/**
 *
 * @author Dego
 */
public class AuthService extends Thread implements IAuthService {

    private final String host;
    private final int port;
    private IAuthProvider auhtProvider;
    
    public AuthService(){
        this("localhost", 3000);
    }
    
    public AuthService(String host, int port){
        this.host = host;
        this.port = port;
        try{
            Registry registry = LocateRegistry.getRegistry(this.host, this.port);
            this.auhtProvider = (IAuthProvider) registry.lookup("AuthProvider");
        }catch(NotBoundException | RemoteException e) {
            System.out.println("[rmi] error: " + e);
        }
    }

    @Override
    public Response<Boolean> Auth(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response<User> GetUser(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response<String> Login(LoginArgs la) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response<String> Register(RegisterArgs ra) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
