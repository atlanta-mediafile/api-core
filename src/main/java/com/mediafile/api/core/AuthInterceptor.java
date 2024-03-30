/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core;

import com.mediafile.api.core.repositories.rmi.IUserRepository;
import com.mediafile.rmi.classes.Response;
import java.util.NoSuchElementException;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.SoapBody;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapHeaderElement;
import org.springframework.ws.soap.SoapMessage;

/**
 *
 * @author Dego
 */
@Component
public class AuthInterceptor implements EndpointInterceptor {

    private static final String NAMESPACE_URI = "http://www.generated.classes.mediafile.com/soap";
    
    @Autowired
    private IUserRepository userRepository;
    
    @Override
    public boolean handleRequest(MessageContext mc, Object o) throws Exception {
        SoapMessage soapMessage = (SoapMessage) mc.getRequest();
        SoapBody soapBody = soapMessage.getSoapBody();
        SoapHeader soapHeader = soapMessage.getSoapHeader();
        
        Source bodySource = soapBody.getPayloadSource();
        DOMSource bodyDomSource = (DOMSource) bodySource;
        String localpart = bodyDomSource.getNode().getLocalName();
        
        if(localpart.equals("Login") || localpart.equals("Register")){
            return true;
        }
        SoapHeaderElement auth;
        try{
            auth = soapHeader.examineHeaderElements(new QName(NAMESPACE_URI, "Authorization")).next();
        }catch(NoSuchElementException e){
            throw new Exception("Authorization element in the header not found");
        }
        
        Response<Boolean> res = userRepository.Auth(auth.getText());
        
        if(!res.isSuccess()){
            if(res.getErrors().length > 0){
                throw new Exception(res.getErrors()[0]);
            }
            throw new Exception("Invalid token");
        }
        
        return true;
    }

    @Override
    public boolean handleResponse(MessageContext mc, Object o) throws Exception {
        return true;
    }

    @Override
    public boolean handleFault(MessageContext mc, Object o) throws Exception {
        return true;
    }

    @Override
    public void afterCompletion(MessageContext mc, Object o, Exception excptn) throws Exception {
    }
    
}
