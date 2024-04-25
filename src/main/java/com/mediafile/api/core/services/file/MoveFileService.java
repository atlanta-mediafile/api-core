/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.services.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mediafile.api.core.repositories.grpc.IFileRepository;
import com.mediafile.api.core.repositories.rest.IFileDataRepository;
import com.mediafile.api.core.utils.Mapper;
import com.mediafile.classes.generated.rest.File;
import com.mediafile.classes.generated.rest.Response;
import com.mediafile.classes.generated.soap.MoveFileResponse;
import com.mediafile.classes.generated.soap.MoveFileRequest;


/**
 *
 * @author Dego
 */
@Component
public class MoveFileService {
    
   
    @Autowired
    private IFileDataRepository fileService;
    
    public MoveFileResponse moveFile(MoveFileRequest request) {
        
        
        MoveFileResponse response = new MoveFileResponse();

        // Obtener los datos de la solicitud
        
        String userId = request.getTarget().getUserId();
        String fileId = request.getTarget().getFileId();
        String folderId = request.getFolderId();
       
        

        Response<File> res = fileService.moveFile(userId,fileId,folderId);
        response.setSuccess(res.isSuccess());
        if(!res.isSuccess()){
            response.setSuccess(false);
            response.setErrors(Mapper.getErrors(res.getErrors()));
            return response;
        }
        response.setSuccess(res.isSuccess());
        response.setErrors(Mapper.getErrors());
        
        return response;
        

    }
    
}
