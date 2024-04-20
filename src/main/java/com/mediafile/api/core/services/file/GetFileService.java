/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.services.file;

import com.mediafile.classes.generated.soap.GetFilesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mediafile.api.core.repositories.rest.IFolderDataRepository;
import com.mediafile.api.core.utils.Mapper;
import com.mediafile.classes.generated.rest.File;
import com.mediafile.classes.generated.rest.Folder;
import com.mediafile.classes.generated.rest.FolderResponse;
import com.mediafile.classes.generated.rest.Response;
import com.mediafile.classes.generated.soap.FileInfo;
import com.mediafile.classes.generated.soap.FilesInfo;
import com.mediafile.classes.generated.soap.FolderInfo;
import com.mediafile.classes.generated.soap.Folders;
import com.mediafile.classes.generated.soap.GetFilesRequest;
import java.math.BigInteger;

/**
 *
 * @author Dego
 */
@Component
public class GetFileService {
    
    @Autowired
    private IFolderDataRepository metadataRepository;
    
    public GetFilesResponse getFile(GetFilesRequest request) {
        GetFilesResponse response = new GetFilesResponse();
        
        Response<FolderResponse> res = metadataRepository.getFolder(
            request.getTarget().getUserId(), 
            request.getTarget().getFolderId()
        );
        
        if(!res.isSuccess()){
            response.setSuccess(false);
            response.setErrors(Mapper.getErrors(res.getErrors()));
            return response;
        }
        
        GetFilesResponse.Data data = new GetFilesResponse.Data();
        
        FilesInfo files = new FilesInfo();
        
        File[] _files = new File[0];
        
        if(res.getData().getFiles() != null){
            _files = res.getData().getFiles();
        }
        
        Folder[] _folders = new Folder[0];

        if(res.getData().getFolders() != null){
            _folders = res.getData().getFolders();
        }
        
        for (File file : _files) {
            FileInfo fileRes = new FileInfo();
            fileRes.setId(file.getId());
            fileRes.setFolderId(file.getFolderId());
            fileRes.setName(file.getName());
            fileRes.setExtension(file.getExtension());
            fileRes.setCreatedDate(BigInteger.valueOf(file.getCreatedDate().getTime()));
            fileRes.setSize(BigInteger.valueOf(file.getSize()));
            files.getFiles().add(fileRes);
        }
        
        Folders folders = new Folders();
        
        for (Folder folder : _folders) {
            FolderInfo folderRes = new FolderInfo();
            folderRes.setId(folder.getId());
            folderRes.setName(folder.getName());
            folderRes.setFolderId(folder.getParentId());
            folders.getFolders().add(folderRes);
        }
        
        data.setFiles(files);
        data.setFolders(folders);
        
        response.setSuccess(true);
        response.setData(data);
     
        return response;
    }
    
}
