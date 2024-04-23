/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mediafile.api.core.repositories.grpc;

import com.google.protobuf.ByteString;

/**
 *
 * @author 000430063
 */
public interface IFileRepository {
    
    /**
     *  
     * @param fileBytes file bytes
     * @return array 0 index uuid string, 1 index ip location
     */
    public String[] uploadFile(byte[] fileBytes);
    
    /**
     *
     * @param fileId uuid string
     * @return file in base64 format
     */
    public String getFile(String fileId);
    
    /**
     *
     * @param b64File file in base64 format
     * @return uuid string
     */
    public String uploadFileAsync(String b64File);
    
    /**
     *
     * @param fileId uuid string
     * @return file in base64 format
     */
    public String getFileAsync(String fileId);
    
}
