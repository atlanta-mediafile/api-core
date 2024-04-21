/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.endpoints.folder;

import com.mediafile.api.core.services.folder.CreateFolderService;
import com.mediafile.api.core.services.folder.DeleteFolderService;
import com.mediafile.api.core.services.folder.MoveFolderService;
import com.mediafile.api.core.services.folder.RenameFolderService;
import com.mediafile.api.core.services.folder.ShareFolderService;
import com.mediafile.api.core.utils.Mapper;
import com.mediafile.classes.generated.soap.CreateFolderRequest;
import com.mediafile.classes.generated.soap.CreateFolderResponse;
import com.mediafile.classes.generated.soap.DeleteFolderRequest;
import com.mediafile.classes.generated.soap.DeleteFolderResponse;
import com.mediafile.classes.generated.soap.MoveFolderRequest;
import com.mediafile.classes.generated.soap.MoveFolderResponse;
import com.mediafile.classes.generated.soap.RenameFolderRequest;
import com.mediafile.classes.generated.soap.RenameFolderResponse;
import com.mediafile.classes.generated.soap.ShareFolderRequest;
import com.mediafile.classes.generated.soap.ShareFolderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 *
 * @author 000430063
 */
@Endpoint
public class FolderEndpoint implements IFolderEndpoint {
        
    private static final String NAMESPACE_URI = "http://www.generated.classes.mediafile.com/soap";
    
    @Autowired
    private CreateFolderService createFolder;
    
    @Autowired
    private RenameFolderService renameFolder;
    
    @Autowired
    private DeleteFolderService deleteFolder;
    
    @Autowired
    private ShareFolderService shareFolder;
    
    @Autowired
    private MoveFolderService moveFolder;
    
    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ShareFolderRequest")
    public ShareFolderResponse shareFolder(@RequestPayload ShareFolderRequest request) {
        try{
            return shareFolder.shareFolder(request);
        }catch(Exception ex){
            ShareFolderResponse res = new ShareFolderResponse();
            res.setErrors(Mapper.getErrors(ex.getMessage()));
            return res;
        }
    }

    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DeleteFolderRequest")
    public DeleteFolderResponse deleteFolder(@RequestPayload DeleteFolderRequest request) {
        try{
            return deleteFolder.deleteFolder(request);
        }catch(Exception ex){
            DeleteFolderResponse res = new DeleteFolderResponse();
            res.setErrors(Mapper.getErrors(ex.getMessage()));
            return res;
        }
    }

    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "MoveFolderRequest")
    public MoveFolderResponse moveFolder(@RequestPayload MoveFolderRequest request) {
        try{
            return moveFolder.moveFolder(request);
        }catch(Exception ex){
            MoveFolderResponse res = new MoveFolderResponse();
            res.setErrors(Mapper.getErrors(ex.getMessage()));
            return res;
        }
    }

    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CreateFolderRequest")
    public CreateFolderResponse createFolder(@RequestPayload CreateFolderRequest request) {
        try{
            return createFolder.createFolder(request);
        }catch(Exception ex){
            System.out.println(ex);
            CreateFolderResponse res = new CreateFolderResponse();
            res.setErrors(Mapper.getErrors(ex.getMessage()));
            return res;
        }
    }

    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "RenameFolderRequest")
    public RenameFolderResponse renameFOlder(@RequestPayload RenameFolderRequest request) {
        try{
            return renameFolder.renameFolder(request);
        }catch(Exception ex){
            RenameFolderResponse res = new RenameFolderResponse();
            res.setErrors(Mapper.getErrors(ex.getMessage()));
            return res;
        }
    }
    
}
