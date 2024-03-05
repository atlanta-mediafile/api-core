/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.repositories.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;

/**
 *
 * @author 000430063
 */
public class HttpClient {
    
    public void Get(String uri) throws URISyntaxException {
        HttpClient client = new HttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(new URI(uri))
            .headers("Content-Type", "application/json;charset=UTF-8")
            .GET()
            .build();
        
    }
    
}
