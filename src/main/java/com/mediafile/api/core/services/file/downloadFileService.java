/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.services.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mediafile.api.core.repositories.grpc.IFileRepository;
import com.mediafile.api.core.repositories.rest.IFileDataRepository;

/**
 *
 * @author Dego
 */
@Component
public class downloadFileService {
    
    @Autowired
    private IFileRepository metadataService;
    @Autowired
    private IFileRepository fileService;
    
    public byte downloadFile(String ID) {
        
        fileService.getFile(ID);
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
