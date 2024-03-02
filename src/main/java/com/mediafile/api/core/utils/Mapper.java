/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.api.core.utils;

import com.mediafile.classes.generated.soap.Errors;
import java.util.Arrays;

/**
 *
 * @author 000430063
 */
public class Mapper {
    
    public static Errors getErrors(String[] errors){
        Errors listE = new Errors();
        listE.getError().addAll(Arrays.asList(errors));
        return listE;
    }
    
}
