/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
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

/**
 *
 * @author 000430063
 */
public interface IFileService {
    
    public GetFilesResponse getFiles(GetFiles request);

    public ShareFileResponse shareFile(ShareFile request);
    
    public UploadFileResponse uploadFile(UploadFile request);
    
    public DeleteFileResponse deleteFile(DeleteFile request);
    
    public MoveFileResponse moveFile(MoveFile request);
    
    public EditFileResponse editFile(EditFile request);
    
    public DownloadFilesResponse downloadFile(DownloadFiles request);
    
}
