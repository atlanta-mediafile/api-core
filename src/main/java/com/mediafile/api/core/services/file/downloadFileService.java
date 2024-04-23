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

import com.mediafile.classes.generated.soap.DownloadFilesRequest;
import com.mediafile.classes.generated.soap.DownloadFilesResponse;
import com.mediafile.classes.generated.rest.Response;
import com.mediafile.classes.generated.soap.File;
import java.math.BigInteger;


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

        public DownloadFilesResponse downloadFile(DownloadFilesRequest request) {
            DownloadFilesResponse response = new DownloadFilesResponse();

            String fileId = request.getTarget().getFileId();
            String fileStringContent = fileRepository.getFile(fileId);

            if(fileStringContent == null) {
                response.setSuccess(false);
                response.setErrors(Mapper.getErrors("Unable to get file"));
                return response;
            }
            
            Response<com.mediafile.classes.generated.rest.File> restFile = fileDataRepository.getFile(request.getTarget().getUserId(), fileId);

            if(!restFile.isSuccess()) {
                response.setSuccess(false);
                response.setErrors(Mapper.getErrors(restFile.getErrors()));
                return response;
            }

            File file = new File(); 
            file.setContent(fileStringContent);
            file.setCreatedDate(BigInteger.valueOf(restFile.getData().getCreatedDate().getTime()));
            file.setExtension(restFile.getData().getExtension());
            file.setFolderId(restFile.getData().getFolderId());
            file.setId(fileId);
            file.setMimeType(restFile.getData().getMimeType());
            file.setName(restFile.getData().getName());
            file.setSize(BigInteger.valueOf(restFile.getData().getSize()));

            response.setSuccess(true);
            response.setData(file);
            response.setErrors(Mapper.getErrors());

            return response;
        }
    
}
