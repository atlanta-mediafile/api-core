/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mediafile.api.core.repositories.rest;

import com.mediafile.classes.generated.rest.File;
import com.mediafile.classes.generated.rest.Folder;
import com.mediafile.classes.generated.rest.FolderResponse;
import com.mediafile.classes.generated.rest.Response;

/**
 *
 * @author 000430063
 */
public interface IFolderDataRepository {
    
    /**
     *
     * @param userId user id
     * @param folderId folder id
     * @return
     */
    public Response<FolderResponse> getFolder(String userId, String folderId);
    
    /**
     *  Share folder
     * @param userId user id
     * @param folderId folder id
     * @param users users id for share files
     * @return
     */
    public Response<String> shareFolder(String userId, String folderId, String[] users);
    
    /**
     *  Delete folder
     * @param userId user id
     * @param folderId folder id
     * @return
     */
    public Response<File> deleteFolder(String userId, String folderId);
    
    /**
     *  Move folder
     * @param userId user id
     * @param folderId folder id
     * @param newFolderId folder id, reference the new folder
     * @return
     */
    public Response<File> moveFolder(String userId, String folderId, String newFolderId);
    
    /**
     *  Edit folder name
     * @param userId user id
     * @param newName new folder name
     * @return
     */
    public Response<File> editName(String userId, String newName);
    
    /**
     *  Create folder
     * @param userId user id
     * @param folder new folder
     * @return
     */
    public Response<String> createFolder(String userId, Folder folder);
    
}
