/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.repositories.rest;

import com.mediafile.classes.generated.rest.File;
import com.mediafile.classes.generated.rest.Response;
import java.io.IOException;
import java.net.URISyntaxException;
import org.springframework.stereotype.Component;

/**
 *
 * @author 000430063
 */
public class FileDataRepository implements IFileDataRepository {
  
    @Override
    public Response<File> getFile(String userId, String fileId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
    public Response<String> saveMetadata(String userId, File newFile) {
        try {
            return (Response<String>) Request.Post("http://localhost:3001/file", this, Response.class);
        } catch (URISyntaxException | IOException | InterruptedException ex) {
        return new Response<>(new String[0], false, null);
        }
    }
    
}
