/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core;

import com.mediafile.api.core.services.user.GetUserService;
import com.mediafile.api.core.repositories.grpc.FileRepository;
import com.mediafile.api.core.repositories.rest.FileDataRepository;
import com.mediafile.api.core.repositories.rmi.UserRepository;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import com.mediafile.api.core.repositories.grpc.IFileRepository;
import com.mediafile.api.core.repositories.rest.FolderDataRepository;
import com.mediafile.api.core.repositories.rmi.IUserRepository;
import com.mediafile.api.core.repositories.rest.IFileDataRepository;
import com.mediafile.api.core.repositories.rest.IFolderDataRepository;

/**
 *
 * @author 000430063
 */
@EnableWs
@Configuration
public class WebServiceConfig {
    
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }
    
    @Bean(name = "mediafileTypes")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema songsSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("FilesPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://www.generated.classes.mediafile.com/soap");
        wsdl11Definition.setSchema(songsSchema);
        return wsdl11Definition;
    }
    
    @Bean
    public GetUserService getUserController(){
        return new GetUserService();
    }
    
    @Bean
    public IUserRepository getAuthService(){
        return new UserRepository();
    }
    
    @Bean
    public IFileRepository getFileService(){
        return new FileRepository();
    }
    
    @Bean
    public IFileRepository getMetadatService(){
        return new FileRepository();
    }
    
    @Bean
    public IFileDataRepository getFileDataRepository(){
        return new FileDataRepository();
    }
    
    @Bean
    public IFolderDataRepository getFolderDataRepository(){
        return new FolderDataRepository();
    }
    
    @Bean
    public XsdSchema mediafileSchema() {
        return new SimpleXsdSchema(new ClassPathResource("soap/mediafileTypes.xsd"));
    }
    
}
