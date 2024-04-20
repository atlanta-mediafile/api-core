/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mediafile.api.core.endpoints.file;

import com.mediafile.classes.generated.soap.DeleteFileRequest;
import com.mediafile.classes.generated.soap.DeleteFileResponse;
import com.mediafile.classes.generated.soap.DownloadFilesRequest;
import com.mediafile.classes.generated.soap.DownloadFilesResponse;
import com.mediafile.classes.generated.soap.EditFileRequest;
import com.mediafile.classes.generated.soap.EditFileResponse;
import com.mediafile.classes.generated.soap.GetFilesRequest;
import com.mediafile.classes.generated.soap.GetFilesResponse;
import com.mediafile.classes.generated.soap.MoveFileRequest;
import com.mediafile.classes.generated.soap.MoveFileResponse;
import com.mediafile.classes.generated.soap.ShareFileRequest;
import com.mediafile.classes.generated.soap.ShareFileResponse;
import com.mediafile.classes.generated.soap.UploadFileRequest;
import com.mediafile.classes.generated.soap.UploadFileResponse;

/**
 *
 * @author 000430063
 */
public interface IFileEndpoint {
    
    public GetFilesResponse getFiles(GetFilesRequest request);

    public ShareFileResponse shareFile(ShareFileRequest request);
    
    public UploadFileResponse uploadFile(UploadFileRequest request);
    
    public DeleteFileResponse deleteFile(DeleteFileRequest request);
    
    public MoveFileResponse moveFile(MoveFileRequest request);
    
    public EditFileResponse editFile(EditFileRequest request);
    
    public DownloadFilesResponse downloadFile(DownloadFilesRequest request);
    
}
