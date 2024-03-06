/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.services.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mediafile.api.core.repositories.grpc.IFileRepository;
import com.mediafile.api.core.repositories.rest.IFileDataRepository;
import com.mediafile.classes.generated.rest.File;
import com.mediafile.classes.generated.rest.Response;
import com.mediafile.classes.generated.soap.UploadFile;
import java.util.Base64;

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
    
    public boolean uploadFile(UploadFile uploadFile) {
        
        byte[] bytes = Base64.getDecoder().decode(uploadFile.getContent());
        
        String id = fileRepo.uploadFile(bytes);
        
        if(id == null){
            return false;
        }
        
        int size = bytes.length;
        
        File newFile = new File();
        
        newFile.setId(id);
        newFile.setName(uploadFile.getName());
        newFile.setExtension(uploadFile.getExtension());
        newFile.setSize(size);
        newFile.setFolderId(uploadFile.getFolderId());
        
        Response<String> res = fileDataRepo.saveMetadata(id, newFile);
        
        return res.isSuccess();
    }
    
}
