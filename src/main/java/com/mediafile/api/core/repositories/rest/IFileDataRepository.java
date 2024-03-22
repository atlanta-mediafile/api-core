/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mediafile.api.core.repositories.rest;

import com.mediafile.classes.generated.rest.File;
import com.mediafile.classes.generated.rest.Response;

/**
 *
 * @author 000430063
 */
public interface IFileDataRepository {
    
    /**
     *  Get file
     * @param userId id of the user file
     * @param fileId file id
     * @return
     */
    public Response<File> getFile(String userId, String fileId);
    
    /**
     *  Share file
     * @param userId id of the user file
     * @param fileId file id
     * @param users
     * @return
     */
    public Response<String> shareFile(String userId, String fileId, String[] users);
    
    /**
     *  Delete file
     * @param userId id of the user file
     * @param fileId file id
     * @return
     */
    public Response<File> deleteFile(String userId, String fileId);
    
    /**
     *  Delete file
     * @param userId id of the user file
     * @param fileId file id
     * @param folderId folder id, reference the new folder
     * @return
     */
    public Response<File> moveFile(String userId, String fileId, String folderId);
    
    /**
     *  Edit file
     * @param userId id of the user file
     * @param name file name
     * @param extension file extension
     * @return
     */
    public Response<File> editMetadata(String userId, String name, String extension);
    
    /**
     *  Save file
     * @param userId id of the user file
     * @param newFile file to save
     * @return
     */
    public Response<String> saveMetadata(String userId, File newFile);
}
