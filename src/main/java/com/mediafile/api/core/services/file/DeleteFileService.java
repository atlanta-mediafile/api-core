/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.services.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mediafile.api.core.repositories.grpc.IFileRepository;
import com.mediafile.api.core.repositories.rest.IFileDataRepository;
import com.mediafile.classes.generated.soap.DeleteFile;
import com.mediafile.classes.generated.soap.Identifiers;
import com.mediafile.classes.generated.rest.File;
import com.mediafile.classes.generated.rest.Response;
import com.mediafile.classes.generated.soap.DeleteFileResponse;
import com.mediafile.api.core.utils.Mapper;

/**
 *
 * @author Dego
 */
@Component
public class DeleteFileService {
    
    @Autowired
    private IFileDataRepository fileService;
    
    public DeleteFileResponse deleteFile(DeleteFile request) {
        DeleteFileResponse response = new DeleteFileResponse();

        // Obtener los datos de la solicitud
        
        String userId = request.getTarget().getUserId();
        String fileId = request.getTarget().getFileId();
  

        Response<File> res = fileService.deleteFile(userId,fileId);
        response.setSuccess(res.isSuccess());
        if(!res.isSuccess()){
            response.setSuccess(false);
            response.setErrors(Mapper.getErrors(res.getErrors()));
            return response;
        }

        return response;
        

    }
}
