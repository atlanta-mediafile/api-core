/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.repositories.rest;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.mediafile.classes.generated.rest.DeleteFolderReponse;
import com.mediafile.classes.generated.rest.Folder;
import com.mediafile.classes.generated.rest.FolderResponse;
import com.mediafile.classes.generated.rest.MoveFolderRequest;
import com.mediafile.classes.generated.rest.RenameFolderRequest;
import com.mediafile.classes.generated.rest.Response;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URISyntaxException;
import java.util.Map;

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
            System.out.println("[api-core] error: " + ex);
            res = new Response(new String[]{"Server error", ex.getMessage()});
        }
        
        return res;
    }

    @Override
    public Response<Map<String, Object>> shareFolder(String userId, String folderId, String[] users) {
        
        String url = BASE_URL + "/user/" + userId + "/folder/" + folderId;
        System.out.println(url);
        Response<Map<String, Object>> res;
        
        Type type = new TypeToken<Response<Map<String, Object>>>() { }.getType();
        try {
            res = (Response<Map<String, Object>>) Request.Post(url, users, type);
        } catch (URISyntaxException | IOException | InterruptedException | JsonSyntaxException ex ) {
            System.out.println("[api-core] error: " + ex);
            res = new Response(new String[]{"Server error"});
        }
          
        return res;
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
            System.out.println("[api-core] error: " + ex);
            res = new Response(new String[]{"Server error"});
        }
          
        return res;
    }

    @Override
    public Response<Folder> moveFolder(String userId, String folderId, String newFolderId) {
        
        String url = BASE_URL + "/user/" + userId + "/folder/" + folderId;
        System.out.println(url);
        Response<Folder> res;
        
        Type type = new TypeToken<Response<Folder>>() { }.getType();
        try {
            MoveFolderRequest request = new MoveFolderRequest();
            request.setNewFolderId(newFolderId);
            res = (Response<Folder>) Request.Patch(url, request, type);
        } catch (URISyntaxException | IOException | InterruptedException | JsonSyntaxException ex ) {
            System.out.println("[api-core] error: " + ex);
            res = new Response(new String[]{"Server error"});
        }
        
        return res;
    }

    @Override
    public Response<Folder> editName(String userId, String folderId, String newName) {
        
        String url = BASE_URL + "/user/" + userId + "/folder/" + folderId;
        System.out.println(url);
        Response<Folder> res;
        
        Type type = new TypeToken<Response<Folder>>() { }.getType();
        try {
            RenameFolderRequest request = new RenameFolderRequest();
            request.setName(newName);
            res = (Response<Folder>) Request.Put(url, request, type);
        } catch (URISyntaxException | IOException | InterruptedException | JsonSyntaxException ex ) {
            System.out.println("[api-core] error: " + ex);
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
            System.out.println("[api-core] error: " + ex);
            res = new Response(new String[]{"Server error"});
        }
        
        return res;
    }
    
}
