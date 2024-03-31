/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.endpoints.file;

import com.mediafile.classes.generated.soap.DeleteFile;
import com.mediafile.classes.generated.soap.DeleteFileResponse;
import com.mediafile.classes.generated.soap.DownloadFiles;
import com.mediafile.classes.generated.soap.DownloadFilesResponse;
import com.mediafile.classes.generated.soap.EditFile;
import com.mediafile.classes.generated.soap.EditFileResponse;
import com.mediafile.classes.generated.soap.GetFiles;
import com.mediafile.classes.generated.soap.GetFilesResponse;
import com.mediafile.classes.generated.soap.MoveFile;
import com.mediafile.classes.generated.soap.MoveFileResponse;
import com.mediafile.classes.generated.soap.ShareFile;
import com.mediafile.classes.generated.soap.ShareFileResponse;
import com.mediafile.classes.generated.soap.UploadFile;
import com.mediafile.classes.generated.soap.UploadFileResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.mediafile.api.core.services.file.UploadFileService;
import com.mediafile.api.core.utils.Mapper;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import com.mediafile.api.core.services.file.downloadFileService;
import com.mediafile.classes.generated.soap.File;


/**
 *
 * @author 000430063
 */
@Endpoint
public class FileEndpoint implements IFileEndpoint {
   
    private static final String NAMESPACE_URI = "http://www.generated.classes.mediafile.com/soap";
    
    @Autowired
    private UploadFileService uploadFile;
    
    @Autowired
    private downloadFileService downloadFile;
    
    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetFiles")
    public GetFilesResponse getFiles(@RequestPayload GetFiles request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ShareFile")
    public ShareFileResponse shareFile(@RequestPayload ShareFile request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UploadFile")
    public UploadFileResponse uploadFile(@RequestPayload UploadFile request) {
        try{
            return uploadFile.uploadFile(request);
        }catch(Exception ex){
            UploadFileResponse res = new UploadFileResponse();
            res.setErrors(Mapper.getErrors("Server error"));
            return res;
        }
    }

    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DeleteFile")
    public DeleteFileResponse deleteFile(@RequestPayload DeleteFile request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "MoveFile")
    public MoveFileResponse moveFile(@RequestPayload MoveFile request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "EditFile")
    public EditFileResponse editFile(@RequestPayload EditFile request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

@Override
@ResponsePayload
@PayloadRoot(namespace = NAMESPACE_URI, localPart = "DownloadFiles")
public DownloadFilesResponse downloadFile(@RequestPayload DownloadFiles request) {
     File file = downloadFile.downloadFile(request);
    
    
    
    DownloadFilesResponse response = new DownloadFilesResponse();
    
    response.setData(file);
    response.setSuccess(true);
    
    return response;
    
}







    
}