/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.endpoints.file;

import com.mediafile.classes.generated.soap.DeleteFileRequest;
import com.mediafile.classes.generated.soap.DeleteFileResponse;
import com.mediafile.classes.generated.soap.DownloadFilesRequest;
import com.mediafile.classes.generated.soap.DownloadFilesResponse;
import com.mediafile.classes.generated.soap.EditFileRequest;
import com.mediafile.classes.generated.soap.EditFileResponse;
import com.mediafile.api.core.services.file.EditFileService;
import com.mediafile.api.core.services.file.GetFileService;
import com.mediafile.classes.generated.soap.GetFilesRequest;
import com.mediafile.classes.generated.soap.GetFilesResponse;
import com.mediafile.classes.generated.soap.MoveFileRequest;
import com.mediafile.classes.generated.soap.MoveFileResponse;
import com.mediafile.classes.generated.soap.ShareFileRequest;
import com.mediafile.classes.generated.soap.ShareFileResponse;
import com.mediafile.classes.generated.soap.UploadFileRequest;
import com.mediafile.classes.generated.soap.UploadFileResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.mediafile.api.core.services.file.UploadFileService;
import com.mediafile.api.core.services.file.DeleteFileService;
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
    
    @Autowired
    private EditFileService editFileService;
    
    @Autowired
    private GetFileService getFileService;
    
    @Autowired
    private DeleteFileService deleteFile;
    
    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetFiles")
    public GetFilesResponse getFiles(@RequestPayload GetFilesRequest request) {
        try{
            return getFileService.getFile(request);
        }catch(Exception ex){
            GetFilesResponse res = new GetFilesResponse();
            res.setErrors(Mapper.getErrors(ex.getMessage()));
            return res;
        }
    }

    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ShareFile")
    public ShareFileResponse shareFile(@RequestPayload ShareFileRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UploadFile")
    public UploadFileResponse uploadFile(@RequestPayload UploadFileRequest request) {
        try{
            return uploadFile.uploadFile(request);
        }catch(Exception ex){
            UploadFileResponse res = new UploadFileResponse();
            res.setErrors(Mapper.getErrors(ex.getMessage()));
            return res;
        }
    }

    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DeleteFile")
    public DeleteFileResponse deleteFile(@RequestPayload DeleteFileRequest request) {
        try{
            return deleteFile.deleteFile(request);
        }catch(Exception ex){
            DeleteFileResponse res = new DeleteFileResponse();
            res.setErrors(Mapper.getErrors(ex.getMessage()));
            return res;
        }
    }

    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "MoveFile")
    public MoveFileResponse moveFile(@RequestPayload MoveFileRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "EditFile")
    public EditFileResponse editFile(@RequestPayload EditFileRequest request) {
        try{
            return editFileService.editFile(request);
        }catch(Exception ex){
            EditFileResponse res = new EditFileResponse();
            res.setErrors(Mapper.getErrors(ex.getMessage()));
            return res;
        }
    }

    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DownloadFiles")
    public DownloadFilesResponse downloadFile(@RequestPayload DownloadFilesRequest request) {
         File file = downloadFile.downloadFile(request);



        DownloadFilesResponse response = new DownloadFilesResponse();

        response.setData(file);
        response.setSuccess(true);

        return response;

    }







    
}