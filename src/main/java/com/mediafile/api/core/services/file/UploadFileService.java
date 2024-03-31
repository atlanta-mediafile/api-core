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
import com.mediafile.classes.generated.soap.UploadFile;
import com.mediafile.classes.generated.soap.UploadFileResponse;
import java.util.Base64;
import java.util.Date;

/**
 *
 * @author Dego
 */
@Component
public class UploadFileService {
    
    @Autowired
    private IFileDataRepository fileDataRepo;
    @Autowired
    private IFileRepository fileRepo;
    
    public UploadFileResponse uploadFile(UploadFile uploadFile) {
        
        UploadFileResponse response = new UploadFileResponse();
        
        byte[] bytes = Base64.getDecoder().decode(uploadFile.getContent());
        
        String id = fileRepo.uploadFile(bytes);
        
        if(id == null){
            response.setSuccess(false);
            response.setErrors(Mapper.getErrors("Failed to upload file, try later"));
            return response;
        }
        
        int size = bytes.length;
        
        File newFile = new File();
        
        newFile.setId(id);
        newFile.setId(id);
        newFile.setName(uploadFile.getName());
        newFile.setExtension(uploadFile.getExtension());
        newFile.setMimeType("application/xlsx");
        newFile.setFolderId(uploadFile.getFolderId());
        newFile.setSize(size);
        newFile.setCreatedDate(new Date());
        newFile.setStatus(true);
        
        Response<File> res = fileDataRepo.saveMetadata(id, newFile);
        
        if(!res.isSuccess()){
            response.setSuccess(false);
            response.setErrors(Mapper.getErrors(res.getErrors()));
            return response;
        }
        
        response.setSuccess(true);
        response.setData(res.getData().getId());
        
        return response;
    }
    
}
