/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mediafile.api.core.endpoints.folder;

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

/**
 *
 * @author 000430063
 */
public interface IFolderEndpoint {
    
    public ShareFolderResponse shareFolder(ShareFolderRequest request);
    
    public DeleteFolderResponse deleteFolder(DeleteFolderRequest request);
    
    public MoveFolderResponse moveFolder(MoveFolderRequest request);
    
    public CreateFolderResponse createFolder(CreateFolderRequest request);
    
    public RenameFolderResponse renameFOlder(RenameFolderRequest request);
    
}
