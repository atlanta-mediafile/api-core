/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.endpoints.folder;

import com.mediafile.api.core.services.rest.IMetadataService;
import com.mediafile.api.core.services.rmi.IUserService;
import com.mediafile.classes.generated.soap.CreateFolder;
import com.mediafile.classes.generated.soap.CreateFolderResponse;
import com.mediafile.classes.generated.soap.DeleteFolder;
import com.mediafile.classes.generated.soap.DeleteFolderResponse;
import com.mediafile.classes.generated.soap.MoveFolder;
import com.mediafile.classes.generated.soap.MoveFolderResponse;
import com.mediafile.classes.generated.soap.RenameFolder;
import com.mediafile.classes.generated.soap.RenameFolderResponse;
import com.mediafile.classes.generated.soap.ShareFolder;
import com.mediafile.classes.generated.soap.ShareFolderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 *
 * @author 000430063
 */
public class FolderEndpoint implements IFolderEndpoint {
        
    private static final String NAMESPACE_URI = "http://www.generated.classes.mediafile.com/soap";
    
    private final IUserService userService;
    private final IMetadataService metadataService;
    
    @Autowired
    public FolderEndpoint(IUserService userService, IMetadataService metadataService) {
        this.userService = userService;
        this.metadataService = metadataService;
    }
    
    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ShareFolder")
    public ShareFolderResponse shareFolder(@RequestPayload ShareFolder request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DeleteFolder")
    public DeleteFolderResponse deleteFolder(@RequestPayload DeleteFolder request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "MoveFolder")
    public MoveFolderResponse moveFolder(@RequestPayload MoveFolder request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CreateFolder")
    public CreateFolderResponse createFolder(@RequestPayload CreateFolder request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "RenameFolder")
    public RenameFolderResponse renameFOlder(@RequestPayload RenameFolder request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}