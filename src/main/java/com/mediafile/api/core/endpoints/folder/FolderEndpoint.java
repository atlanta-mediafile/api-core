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

/**
 *
 * @author 000430063
 */
public class FolderEndpoint implements IFolderEndpoint {
        
    private final IUserService userService;
    private final IMetadataService metadataService;
    
    @Autowired
    public FolderEndpoint(IUserService userService, IMetadataService metadataService) {
        this.userService = userService;
        this.metadataService = metadataService;
    }
    
    @Override
    public ShareFolderResponse shareFolder(ShareFolder request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DeleteFolderResponse deleteFolder(DeleteFolder request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MoveFolderResponse moveFolder(MoveFolder request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CreateFolderResponse createFolder(CreateFolder request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public RenameFolderResponse renameFOlder(RenameFolder request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
