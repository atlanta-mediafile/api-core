/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.services.folder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mediafile.api.core.repositories.rest.IFolderDataRepository;
import com.mediafile.api.core.utils.Mapper;
import com.mediafile.classes.generated.rest.File;
import com.mediafile.classes.generated.rest.Folder;
import com.mediafile.classes.generated.rest.Response;
import com.mediafile.classes.generated.soap.MoveFolder;
import com.mediafile.classes.generated.soap.MoveFolderResponse;

/**
 *
 * @author Dego
 */
@Component
public class MoveFolderService {
    
    @Autowired
    private IFolderDataRepository folderDataService;
    
    public MoveFolderResponse moveFolder(MoveFolder request) {
        MoveFolderResponse response = new MoveFolderResponse();
        
        Response<Folder> res = folderDataService.moveFolder(
        request.getTarget().getUserId(), 
        request.getTarget().getFolderId(), 
        request.getFolderId()
        );
        
        if(!res.isSuccess()){
            response.setSuccess(false);
            response.setErrors(Mapper.getErrors(res.getErrors()));
            return response;
        }
        
        response.setSuccess(true);
        
        return response;
    }
    
}
