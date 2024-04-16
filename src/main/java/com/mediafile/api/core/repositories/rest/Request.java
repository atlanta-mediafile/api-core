/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.repositories.rest;

import com.google.gson.Gson;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

/**
 *
 * @author 000430063
 */
public class Request {
    
    public static Object Post(String uri, Object body, Type typeOfT) 
        throws URISyntaxException, IOException, InterruptedException
    {
        Gson gson = new Gson();
        String json = gson.toJson(body);
         
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(new URI(uri))
            .headers("Content-Type", "application/json;charset=UTF-8")
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .timeout(Duration.ofSeconds(10))
            .build();
        
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        
        var res = gson.fromJson(response.body(), typeOfT);
        return res;
    }
    
    public static Object Put(String uri, Object body, Type typeOfT) 
        throws URISyntaxException, IOException, InterruptedException
    {
        Gson gson = new Gson();
        String json = gson.toJson(body);
         
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(new URI(uri))
            .headers("Content-Type", "application/json;charset=UTF-8")
            .PUT(HttpRequest.BodyPublishers.ofString(json))
            .build();
        
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        var res = gson.fromJson(response.body(), typeOfT);
        return res;
    }
    
    public static Object Patch(String uri, Object body, Type typeOfT) 
        throws URISyntaxException, IOException, InterruptedException
    {
        Gson gson = new Gson();
        String json = gson.toJson(body);
         
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(new URI(uri))
            .headers("Content-Type", "application/json;charset=UTF-8")
            .method("PATCH", HttpRequest.BodyPublishers.ofString(json))
            .build();
        
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        var res = gson.fromJson(response.body(), typeOfT);
        return res;
    }
    
    public static Object Delete(String uri, Type typeOfT) 
        throws URISyntaxException, IOException, InterruptedException
    {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(new URI(uri))
            .DELETE()
            .build();
        
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        
        Gson gson = new Gson();
        var res = gson.fromJson(response.body(), typeOfT);
        return res;
    }
    
    public static Object Get(String uri, Type typeOfT) 
        throws URISyntaxException, IOException, InterruptedException
    {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(new URI(uri))
            .GET()
            .build();
        
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        
        Gson gson = new Gson();
        var res = gson.fromJson(response.body(), typeOfT);
        return res;
    }
    
}
