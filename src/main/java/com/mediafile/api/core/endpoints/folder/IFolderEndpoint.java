/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mediafile.api.core.endpoints.folder;

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

/**
 *
 * @author 000430063
 */
public interface IFolderEndpoint {
    
    public ShareFolderResponse shareFolder(ShareFolder request);
    
    public DeleteFolderResponse deleteFolder(DeleteFolder request);
    
    public MoveFolderResponse moveFolder(MoveFolder request);
    
    public CreateFolderResponse createFolder(CreateFolder request);
    
    public RenameFolderResponse renameFOlder(RenameFolder request);
    
}
