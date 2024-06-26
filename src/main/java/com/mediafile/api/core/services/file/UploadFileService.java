/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.services.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mediafile.api.core.repositories.grpc.IFileRepository;
import com.mediafile.api.core.repositories.rest.IFileDataRepository;
import com.mediafile.api.core.utils.Base64Utils;
import com.mediafile.api.core.utils.Mapper;
import com.mediafile.classes.generated.rest.File;
import com.mediafile.classes.generated.rest.Response;
import com.mediafile.classes.generated.soap.UploadFileRequest;
import com.mediafile.classes.generated.soap.UploadFileResponse;
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
    
    public UploadFileResponse uploadFile(UploadFileRequest uploadFile) throws Exception {
        
        UploadFileResponse response = new UploadFileResponse();
        
        byte[] bytes = Base64Utils.toBytes(uploadFile.getContent());
        String[] uploadFileRes = fileRepo.uploadFile(bytes);
        
        String fileId = uploadFileRes[0];
        String nodeIp = uploadFileRes[1]; 
        
        if(fileId == null || nodeIp == null){
            response.setSuccess(false);
            response.setErrors(Mapper.getErrors("Failed to upload file, try later"));
            return response;
        }
        int size = bytes.length;
        String mimeType = Base64Utils.getMimeType(uploadFile.getContent());
        bytes = null;
        
        File newFile = new File();
        
        newFile.setId(fileId);
        newFile.setName(uploadFile.getName());
        newFile.setExtension(uploadFile.getExtension());
        newFile.setMimeType(mimeType);
        newFile.setFolderId(uploadFile.getFolderId());
        newFile.setSize(size);
        newFile.setCreatedDate(new Date());
        newFile.setStatus(true);
        newFile.setIpLocation(nodeIp);
        
        Response<File> res = fileDataRepo.saveMetadata(uploadFile.getTarget().getUserId(), newFile);
        
        if(!res.isSuccess()){
            response.setSuccess(false);
            response.setErrors(Mapper.getErrors(res.getErrors()));
            return response;
        }
        
        response.setSuccess(true);
        response.setData(res.getData().getId());
        response.setErrors(Mapper.getErrors());
        
        return response;
    }
    
}
