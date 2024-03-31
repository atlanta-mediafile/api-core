/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.classes.generated.rest;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author admin
 */
public class File implements Serializable {
    
    private String id;
    private String name;
    private String extension;
    @SerializedName("mime_type")
    private String mimeType;
    private int size;
    @SerializedName("folder_id")
    private String folderId;
    @SerializedName("created_date")
    private Date createdDate;
    private boolean status;
    @SerializedName("user_id")
    private String userId;

    public String getUserId() {
        return userId;
    }

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

    public Date getCreatedDate() {
        return createdDate;
    }

    public boolean isStatus() {
        return status;
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

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "File{" + "id=" + id + ", name=" + name + ", extension=" + extension + ", mimeType=" + mimeType + ", size=" + size + ", folderId=" + folderId + ", timeStamp=" + createdDate + '}';
    }
    
}