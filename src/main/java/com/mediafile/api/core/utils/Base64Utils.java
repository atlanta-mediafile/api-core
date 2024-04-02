/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.utils;

import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Dego
 */
public class Base64Utils {
    
    public static String getMimeType(String encoded) {
        System.out.println(encoded);
        
        String result = null;

        if (encoded == null || encoded.isEmpty() || !encoded.startsWith("data:")) {
            return result;
        }

        Pattern pattern = Pattern.compile("data:([a-zA-Z0-9]+/[a-zA-Z0-9-.+]+).*");
        Matcher matcher = pattern.matcher(encoded);

        if (matcher.find()) {
            result = matcher.group(1);
        }

        return result;
    }
    
    public static byte[] toBytes(String b64) throws Exception{
        try{
            if(b64.startsWith("data:")){
                int commaIndex = b64.indexOf(',');
                return Base64.getDecoder().decode(b64.substring(commaIndex + 1));
            }
            return Base64.getDecoder().decode(b64);
        }catch(Exception ex){
            throw new Exception("Invalid file base64");
        }
    }
    
}
