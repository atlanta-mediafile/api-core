/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.repositories.rmi;

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
public class UserRepository extends Thread implements IUserRepository {

    private final String host;
    private final int port;
    private IAuthProvider auhtProvider;
    
    public UserRepository(){
        this("localhost", 3000);
    }
    
    public UserRepository(String host, int port){
        this.host = host;
        this.port = port;
        try{
            Registry registry = LocateRegistry.getRegistry(this.host, this.port);
            this.auhtProvider = (IAuthProvider) registry.lookup("AuthProvider");
            System.out.println("[server] rmi server connected");
        }catch(NotBoundException | RemoteException e) {
            System.out.println("[server] error: " + e);
        }
    }

    @Override
    public Response<Boolean> Auth(String string) {
        return new Response(true);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response<User> GetUser(String id) {
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
