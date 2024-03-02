/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core;

import com.mediafile.api.core.services.grpc.FileService;
import com.mediafile.api.core.services.grpc.IFileService;
import com.mediafile.api.core.services.rest.IMetadataService;
import com.mediafile.api.core.services.rest.MetadataService;
import com.mediafile.api.core.services.rmi.AuthService;
import com.mediafile.api.core.services.rmi.IAuthService;
import java.util.Properties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

/**
 *
 * @author 000430063
 */
public class WebServiceConfig {
    
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }
    
    @Bean(name = "files")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema songsSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("FilesPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://www.generated.classes.mediafile.com/soap");
        wsdl11Definition.setSchema(songsSchema);
        return wsdl11Definition;
    }
    
    @Bean
    public Properties getProperties(){
        return new Properties();
    }
    
    @Bean
    public IAuthService getAuthService(){
        return new AuthService();
    }
    
    @Bean
    public IFileService getFileService(Properties properties){
        return new FileService("", 0);
    }
    
    @Bean
    public IMetadataService getMetadatService(){
        return new MetadataService();
    }
    
    @Bean
    public XsdSchema songsSchema() {
        return new SimpleXsdSchema(new ClassPathResource("songs.xsd"));
    }
    
}