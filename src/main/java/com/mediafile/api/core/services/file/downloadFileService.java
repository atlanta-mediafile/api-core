/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.services.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mediafile.api.core.repositories.grpc.IFileRepository;
import com.mediafile.api.core.repositories.rest.IFileDataRepository;
import java.util.Base64;
import com.mediafile.classes.generated.soap.DownloadFiles;
import com.google.protobuf.ByteString;


/**
 *
 * @author Dego
 */
@Component
public class downloadFileService {
    
    @Autowired
    private IFileDataRepository fileDataRepository ;
    @Autowired
    private IFileRepository fileRepository;
   
    public String downloadFile(DownloadFiles request) {
        String fileId = request.getTarget().getFileId();
        String fileStringContent = fileRepository.getFile(fileId);
        ByteString fileContentByteString = ByteString.copyFromUtf8(fileStringContent);
        byte[] fileContentBytes = fileContentByteString.toByteArray();
        return Base64.getEncoder().encodeToString(fileContentBytes);
    }
    
}
