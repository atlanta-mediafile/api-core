package com.mediafile.api.core.services.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mediafile.api.core.repositories.rest.IFileDataRepository;
import com.mediafile.api.core.utils.Mapper;
import com.mediafile.classes.generated.rest.File;
import com.mediafile.classes.generated.rest.Response;
import com.mediafile.classes.generated.soap.EditFileRequest;
import com.mediafile.classes.generated.soap.EditFileResponse;

@Component
public class EditFileService {
    
 
    @Autowired
    private IFileDataRepository fileService;
    
    public EditFileResponse editFile(EditFileRequest request) {
        EditFileResponse response = new EditFileResponse();
        
        String userId = request.getTarget().getUserId();
        String fileId = request.getTarget().getFileId();
        String name = request.getName();
        String extension = request.getExtension();

        Response<File> res = fileService.editMetadata(userId,fileId, name, extension);
        if(!res.isSuccess()){
            response.setSuccess(false);
            response.setErrors(Mapper.getErrors(res.getErrors()));
            return response;
        }

        response.setSuccess(res.isSuccess());
        response.setErrors(Mapper.getErrors());

        return response;
        

    }
}
