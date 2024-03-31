/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.repositories.rest;

import com.google.gson.reflect.TypeToken;
import com.mediafile.classes.generated.rest.File;
import com.mediafile.classes.generated.rest.Response;
import org.springframework.web.client.RestTemplate;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URISyntaxException;

/**
 *
 * @author 000430063
 */
public class FileDataRepository implements IFileDataRepository {
    
    private final String BASE_URL; 

    public FileDataRepository(String url){
        this.BASE_URL = url;
    }
    
    @Override
    public Response<File> getFile(String userId, String fileId) {
        String url = BASE_URL + "/user/" + userId + "/file/" + fileId;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, Response.class);
    }
    
    @Override
    public Response<String> shareFile(String userId, String fileId, String[] users) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response<File> deleteFile(String userId, String fileId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response<File> moveFile(String userId, String fileId, String folderId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response<File> editMetadata(String userId, String name, String extension) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response<File> saveMetadata(String userId, File newFile) {
        String url = BASE_URL + "/user/" + userId + "/file";
        Response<File> res;
        
        Type type = new TypeToken<Response<File>>() { }.getType();
        try {
            res = (Response<File>) Request.Post(url, newFile, type);
        } catch (URISyntaxException | IOException | InterruptedException ex) {
            res = new Response(new String[]{"Server error"});
        }
        
        return res;
    }
    
}
