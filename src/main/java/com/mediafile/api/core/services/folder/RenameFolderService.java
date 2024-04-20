/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.services.folder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mediafile.api.core.repositories.rest.IFolderDataRepository;
import com.mediafile.api.core.utils.Mapper;
import com.mediafile.classes.generated.rest.Folder;
import com.mediafile.classes.generated.rest.Response;
import com.mediafile.classes.generated.soap.RenameFolderRequest;
import com.mediafile.classes.generated.soap.RenameFolderResponse;

/**
 *
 * @author Dego
 */
@Component
public class RenameFolderService {
    
    @Autowired
    private IFolderDataRepository folderDataService;
    
    public RenameFolderResponse renameFolder(RenameFolderRequest request) {
        
        RenameFolderResponse response = new RenameFolderResponse();
        
        Response<Folder> res = folderDataService.editName(
        request.getTarget().getUserId(), 
        request.getTarget().getFolderId(), 
        request.getName()
        );
        
        if(!res.isSuccess()) {
            response.setSuccess(false);
            response.setErrors(Mapper.getErrors(res.getErrors()));
            return response;
        }
        
        response.setSuccess(true);
        
        return response;
    }
    
}
