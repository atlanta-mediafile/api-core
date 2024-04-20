/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.services.folder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mediafile.api.core.repositories.rest.IFolderDataRepository;
import com.mediafile.api.core.utils.Mapper;
import com.mediafile.classes.generated.rest.Response;
import com.mediafile.classes.generated.soap.ShareFolderRequest;
import com.mediafile.classes.generated.soap.ShareFolderResponse;
import java.util.Map;

/**
 *
 * @author Dego
 */
@Component
public class ShareFolderService {
    
    @Autowired
    private IFolderDataRepository folderDataService;
    
    public ShareFolderResponse shareFolder(ShareFolderRequest request) {
        ShareFolderResponse response = new ShareFolderResponse();
        
        Response<Map<String, Object>> res = folderDataService.shareFolder(
        request.getTarget().getUserId(), 
        request.getTarget().getFolderId(), 
        request.getUsers().getUser().toArray(String[]::new)
        );
        
        if(!res.isSuccess()){
            response.setSuccess(false);
            response.setErrors(Mapper.getErrors(res.getErrors()));
            return response;
        }
        
        response.setSuccess(true);
        return response;
    }
    
}
