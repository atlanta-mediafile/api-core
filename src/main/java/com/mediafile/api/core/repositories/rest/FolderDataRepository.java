/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.repositories.rest;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.mediafile.classes.generated.rest.DeleteFolderReponse;
import com.mediafile.classes.generated.rest.File;
import com.mediafile.classes.generated.rest.Folder;
import com.mediafile.classes.generated.rest.FolderResponse;
import com.mediafile.classes.generated.rest.Response;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URISyntaxException;

/**
 *
 * @author 000430063
 */
public class FolderDataRepository implements IFolderDataRepository {

     private final String BASE_URL; 

    public FolderDataRepository(String url){
        this.BASE_URL = url;
    }
    
    @Override
    public Response<FolderResponse> getFolder(String userId, String folderId) {
        
        String url = BASE_URL + "/user/" + userId + "/folder/" + folderId;
        System.out.println(url);
        Response<FolderResponse> res;
        
        Type type = new TypeToken<Response<FolderResponse>>() { }.getType();
        try {
            res = (Response<FolderResponse>) Request.Get(url, type);
        } catch (URISyntaxException | IOException | InterruptedException | JsonSyntaxException ex ) {
            res = new Response(new String[]{"Server error", ex.getMessage()});
        }
        
        return res;
    }

    @Override
    public Response<String> shareFolder(String userId, String folderId, String[] users) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response<DeleteFolderReponse> deleteFolder(String userId, String folderId) {
        
        String url = BASE_URL + "/user/" + userId + "/folder/" + folderId;
        System.out.println(url);
        Response<DeleteFolderReponse> res;
        
        Type type = new TypeToken<Response<DeleteFolderReponse>>() { }.getType();
        try {
            res = (Response<DeleteFolderReponse>) Request.Delete(url, type);
        } catch (URISyntaxException | IOException | InterruptedException | JsonSyntaxException ex ) {
            res = new Response(new String[]{"Server error"});
        }
          
        return res;
    }

    @Override
    public Response<File> moveFolder(String userId, String folderId, String newFolderId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Response<Folder> editName(String userId, Folder folder) {
        
        String url = BASE_URL + "/user/" + userId + "/folder/" + folder.getId();
        System.out.println(url);
        Response<Folder> res;
        
        Type type = new TypeToken<Response<Folder>>() { }.getType();
        try {
            res = (Response<Folder>) Request.Put(url, folder, type);
        } catch (URISyntaxException | IOException | InterruptedException | JsonSyntaxException ex ) {
            res = new Response(new String[]{"Server error"});
        }
        
        return res;
    }

    @Override
    public Response<Folder> createFolder(String userId, Folder folder) {
        String url = BASE_URL + "/user/" + userId + "/folder";
        Response<Folder> res;
        
        Type type = new TypeToken<Response<Folder>>() { }.getType();
        try {
            res = (Response<Folder>) Request.Post(url, folder, type);
        } catch (URISyntaxException | IOException | InterruptedException | JsonSyntaxException ex ) {
            res = new Response(new String[]{"Server error"});
        }
        
        return res;
    }
    
}
