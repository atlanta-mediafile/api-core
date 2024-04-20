/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.services.folder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mediafile.api.core.repositories.rest.IFolderDataRepository;
import com.mediafile.api.core.utils.Mapper;
import com.mediafile.classes.generated.rest.DeleteFolderReponse;
import com.mediafile.classes.generated.rest.Response;
import com.mediafile.classes.generated.soap.DeleteFolderRequest;
import com.mediafile.classes.generated.soap.DeleteFolderResponse;

/**
 *
 * @author Dego
 */
@Component
public class DeleteFolderService {
    
    @Autowired
    private IFolderDataRepository metadataService;
    
    public DeleteFolderResponse deleteFolder(DeleteFolderRequest request) {
        DeleteFolderResponse response = new DeleteFolderResponse();
        
        Response<DeleteFolderReponse> res = metadataService.deleteFolder(
        request.getTarget().getUserId(), 
        request.getTarget().getFolderId()
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
