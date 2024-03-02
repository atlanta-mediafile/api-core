/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.endpoints.file;

import com.mediafile.api.core.services.grpc.IFileService;
import com.mediafile.api.core.services.rest.IMetadataService;
import com.mediafile.api.core.services.rmi.IUserService;
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

/**
 *
 * @author 000430063
 */
public class FileEndpoint implements IFileEndpoint {
   
    private final IUserService userService;
    private final IMetadataService metadataService;
    private final IFileService fileService;
    
    @Autowired
    public FileEndpoint(IUserService userService, IMetadataService metadataService, IFileService fileService) {
        this.userService = userService;
        this.metadataService = metadataService;
        this.fileService = fileService;
    }
    
    @Override
    public GetFilesResponse getFiles(GetFiles request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ShareFileResponse shareFile(ShareFile request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UploadFileResponse uploadFile(UploadFile request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DeleteFileResponse deleteFile(DeleteFile request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MoveFileResponse moveFile(MoveFile request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EditFileResponse editFile(EditFile request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DownloadFilesResponse downloadFile(DownloadFiles request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
