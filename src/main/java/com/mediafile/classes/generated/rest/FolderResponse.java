/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.classes.generated.rest;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author admin
 */
public class FolderResponse implements Serializable {
    
    private Folder folder;
    private File[] files;
    private Folder[] folders;

    public Folder getFolder() {
        return folder;
    }

    public File[] getFiles() {
        return files;
    }

    public Folder[] getFolders() {
        return folders;
    }

    @Override
    public String toString() {
        return "FolderResponse{" + "folder=" + folder + ", files=" + Arrays.toString(files) + ", folders=" + Arrays.toString(folders) + '}';
    }
    
}
