/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.services.file;

import com.mediafile.api.core.repositories.grpc.IFileService;
import com.mediafile.api.core.repositories.rest.IMetadataService;
import com.mediafile.classes.generated.soap.GetFilesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Dego
 */
@Component
public class GetFileService {
    
    @Autowired
    private IMetadataService metadataService;
    @Autowired
    private IFileService fileService;
    
    public GetFilesResponse.Data getFile() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
