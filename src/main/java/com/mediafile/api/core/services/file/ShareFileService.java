/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.services.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mediafile.api.core.repositories.rest.IFileDataRepository;
import com.mediafile.classes.generated.soap.ShareFileRequest;
import com.mediafile.classes.generated.soap.Identifiers;
import com.mediafile.classes.generated.rest.Response;
import com.mediafile.classes.generated.soap.ShareFileResponse;
import com.mediafile.api.core.utils.Mapper;
import java.util.List;

/**
 *
 * @author Dego
 */
@Component
public class ShareFileService {
    
    @Autowired
    private IFileDataRepository fileService;
    
    public ShareFileResponse shareFile(ShareFileRequest request) {
        ShareFileResponse response = new ShareFileResponse();

        Identifiers target = request.getTarget();
        String userId = target.getUserId();
        String fileId = target.getFileId();
        List<String> users = request.getUsers().getUser();

        
        // Llamar al repositorio para compartir el archivo
        Response<String> res = fileService.shareFile(userId, fileId, users );
        
        // Configurar la respuesta
        if (!res.isSuccess()) {
            response.setSuccess(false);
            response.setErrors(Mapper.getErrors(res.getErrors()));
            return response;
        }
        
        response.setSuccess(res.isSuccess());
        response.setErrors(Mapper.getErrors());

        return response;
    }
}
