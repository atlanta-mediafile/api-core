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
import com.mediafile.classes.generated.soap.CreateFolderRequest;
import com.mediafile.classes.generated.soap.CreateFolderResponse;
import com.mediafile.classes.generated.soap.Errors;

import java.util.Date;
import java.util.UUID;


/**
 *
 * @author Dego
 */
@Component
public class CreateFolderService {
    
    @Autowired
    private IFolderDataRepository folderRepository;
    
    public CreateFolderResponse createFolder(CreateFolderRequest request) {
        CreateFolderResponse response = new CreateFolderResponse();
        
        UUID folderId = UUID.randomUUID();

        Folder folder = new Folder();
        folder.setId(folderId.toString());
        folder.setName(request.getName());
        folder.setParentId(request.getTarget().getFolderId());
        folder.setCreatedDate(new Date());
        folder.setStatus(true);
        
        Response<Folder> res = this.folderRepository.createFolder(request.getTarget().getUserId(), folder);
        
        if(!res.isSuccess()){
            response.setSuccess(false);
            response.setData(null);
            response.setErrors(Mapper.getErrors(res.getErrors()));
            return response;
        }

        response.setSuccess(true);
        response.setData(res.getData().getId());
        response.setErrors(Mapper.getErrors());
        
        return response;
    }
    
}
