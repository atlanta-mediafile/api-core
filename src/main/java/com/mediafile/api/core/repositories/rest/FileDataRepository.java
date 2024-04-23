/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.repositories.rest;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.mediafile.classes.generated.rest.File;
import com.mediafile.classes.generated.rest.Response;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;


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
        Response<File> res;
        
        Type type = new TypeToken<Response<File>>() { }.getType();
        try {
            res = (Response<File>) Request.Get(url , type);
        } catch (URISyntaxException | IOException | InterruptedException ex) {
            System.out.println("[api-core] error: " + ex);
            res = new Response(new String[]{"Server error"});
        }
        
        return res;
    }
    
    @Override
    public Response<Object> shareFile(String userId, String fileId, List<String> users) {
        String url = BASE_URL + "/user/" + userId + "/folder/" + fileId;
        System.out.println(url);
        
        Response<Object> res;
       
        Type type = new TypeToken<Response<Object>>() { }.getType();
        try {
            res = (Response<Object>) Request.Post(url, users, type);
        } catch (URISyntaxException | IOException | InterruptedException | JsonSyntaxException ex ) {
            System.out.println("[api-core] error: " + ex);
            res = new Response(new String[]{"Server error"});
        }
          
        return res;
    }

    @Override
    public Response<File> deleteFile(String userId, String fileId) {
        String url = BASE_URL + "/user/" + userId + "/file/" + fileId;
        Response<File> res;

        Type type = new TypeToken<Response<File>>() {}.getType();
        try {
            res = (Response<File>) Request.Delete(url, type);
        } catch (URISyntaxException | IOException | InterruptedException ex) {
            res = new Response<>(new String[]{"Server error"});
        }

        return res;
    }

    @Override
    public Response<File> moveFile(String userId, String fileId, String folderId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response<File> editMetadata(String userId, String fileId, String name, String extension) {
        String url = BASE_URL + "/user/" + userId + "/file/" +fileId;
        Response<File> res;
        
        Type type = new TypeToken<Response<File>>() { }.getType();
        try {
            File file = new File();
            file.setId(fileId);
            file.setName(name);
            file.setExtension(extension);
            res = (Response<File>) Request.Put(url, file, type);
        } catch (URISyntaxException | IOException | InterruptedException ex) {
            System.out.println("[api-core] error: " + ex);
            res = new Response(new String[]{"Server error"});
        }
        
        return res;
    }
   

    @Override
    public Response<File> saveMetadata(String userId, File newFile) {
        String url = BASE_URL + "/user/" + userId + "/file";
        Response<File> res;
        
        Type type = new TypeToken<Response<File>>() { }.getType();
        try {
            res = (Response<File>) Request.Post(url, newFile, type);
        } catch (URISyntaxException | IOException | InterruptedException ex) {
            System.out.println("[api-core] error: " + ex);
            res = new Response(new String[]{"Server error"});
        }
        
        return res;
    }
    
}
