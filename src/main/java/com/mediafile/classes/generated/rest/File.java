/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.classes.generated.rest;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class File implements Serializable {
    
    private String id;
    private String name;
    private String extension;
    private String mimeType;
    private int size;
    private String folderId;
    private int timeStamp;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public String getMimeType() {
        return mimeType;
    }

    public int getSize() {
        return size;
    }

    public String getFolderId() {
        return folderId;
    }

    public int getTimeStamp() {
        return timeStamp;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public void setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
    }
    
}