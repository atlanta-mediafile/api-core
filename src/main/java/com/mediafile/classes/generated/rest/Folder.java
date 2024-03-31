/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.classes.generated.rest;

import com.google.gson.annotations.SerializedName;
import java.util.Date;

/**
 *
 * @author 000430063
 */
public class Folder {
    
    private String id;
    private String name;
    private boolean status;
    @SerializedName("parent_id")
    private String parentId;
    @SerializedName("created_date")
    private Date createdDate;
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

    public String getParentId() {
        return parentId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Folder{" + "id=" + id + ", name=" + name + ", createdDate=" + createdDate + ", status=" + status + ", parentId=" + parentId + '}';
    }
    
}
