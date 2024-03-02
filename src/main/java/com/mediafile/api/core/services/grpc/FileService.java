/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.services.grpc;

import com.mediafile.classes.generated.grpc.FileServiceGrpc;
import com.mediafile.classes.generated.grpc.FileServiceGrpc.FileServiceBlockingStub;
import com.mediafile.classes.generated.grpc.FileServiceGrpc.FileServiceStub;
import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;


/**
 *
 * @author Dego
 */
public class FileService implements IFileService {
    
    private final FileServiceBlockingStub blockingStub;
    private final FileServiceStub asyncStub;
    private final Channel channel;
    
    public FileService(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port).usePlaintext());
    }
    
    public FileService(ManagedChannelBuilder<?> channelBuilder) {
        this.channel         = channelBuilder.build();
        this.blockingStub    = FileServiceGrpc.newBlockingStub(channel);
        this.asyncStub       = FileServiceGrpc.newStub(channel);
    }
    
    @Override
    public String uploadFile(String b64File) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getFile(String fileId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String uploadFileAsync(String b64File) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getFileAsync(String fileId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
