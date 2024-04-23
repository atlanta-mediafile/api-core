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
import com.mediafile.api.core.services.file.ShareFileService;
import com.mediafile.api.core.utils.Mapper;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import com.mediafile.api.core.services.file.downloadFileService;


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
    
    @Autowired
    private ShareFileService shareFile;
    
    
    
    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetFilesRequest")
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
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ShareFileRequest")
    public ShareFileResponse shareFile(@RequestPayload ShareFileRequest request) {
        try{
            return shareFile.shareFile(request);
        }catch(Exception ex){
            ShareFileResponse res = new ShareFileResponse();
            res.setErrors(Mapper.getErrors(ex.getMessage()));
            return res;
        }
    }

    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UploadFileRequest")
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
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DeleteFileRequest")
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
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "MoveFileRequest")
    public MoveFileResponse moveFile(@RequestPayload MoveFileRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "EditFileRequest")
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
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DownloadFilesRequest")
    public DownloadFilesResponse downloadFile(@RequestPayload DownloadFilesRequest request) {
        try{
            return downloadFile.downloadFile(request);
        }catch(Exception ex){
            DownloadFilesResponse res = new DownloadFilesResponse();
            res.setErrors(Mapper.getErrors(ex.getMessage()));
            return res;
        }
    }

}