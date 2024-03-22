/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.repositories.rest;

import com.google.gson.reflect.TypeToken;
import com.mediafile.classes.generated.rest.File;
import com.mediafile.classes.generated.rest.Folder;
import com.mediafile.classes.generated.rest.FolderResponse;
import com.mediafile.classes.generated.rest.Response;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 *
 * @author 000430063
 */
public class FolderDataRepository implements IFolderDataRepository {

    private static final String BASE_URL = "http://localhost:3000";
    
    @Override
    public Response<FolderResponse> getFolder(String userId, String folderId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response<String> shareFolder(String userId, String folderId, String[] users) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response<File> deleteFolder(String userId, String folderId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response<File> moveFolder(String userId, String folderId, String newFolderId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response<File> editName(String userId, String newName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response<Folder> createFolder(String userId, Folder folder) {
        try {
            String url = String.format("%s/user/%s/folder", BASE_URL, userId);
            Response<Folder> res = (Response<Folder>)Request.Post(url, folder, new TypeToken<Response<Folder>>(){}.getType());
            return res;
        } catch (URISyntaxException | IOException | InterruptedException ex) {
            return new Response<>(new String[]{ex.getMessage()}, false, null);
        }
    }
    
}
