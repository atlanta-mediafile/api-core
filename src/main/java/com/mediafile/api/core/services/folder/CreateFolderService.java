/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.services.folder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mediafile.api.core.repositories.rest.IFolderDataRepository;
import com.mediafile.classes.generated.rest.Folder;
import com.mediafile.classes.generated.rest.Response;
import com.mediafile.classes.generated.soap.CreateFolder;
import java.time.Instant;
import java.util.UUID;

/**
 *
 * @author Dego
 */
@Component
public class CreateFolderService {
    
    @Autowired
    private IFolderDataRepository folderRepository;
    
    public Response createFolder(CreateFolder request) {
        
        UUID folderId = UUID.randomUUID();
        Instant timestamp = Instant.now();

        Folder folder = new Folder();
        folder.setId(folderId.toString());
        folder.setName(request.getName());
        folder.setParentId(request.getFolderId());
        folder.setCreatedDate((int)timestamp.getEpochSecond());
        folder.setStatus(true);
        
        return this.folderRepository.createFolder(request.getTarget().getUserId(), folder);
    }
    
}
