//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.01 a las 10:52:27 PM CST 
//


package com.mediafile.classes.generated.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetFilesResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetFilesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errors" type="{http://www.generated.classes.mediafile.com/soap}Errors"/&gt;
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="data"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="folder" type="{http://www.generated.classes.mediafile.com/soap}FolderInfo"/&gt;
 *                   &lt;element name="files" type="{http://www.generated.classes.mediafile.com/soap}FilesInfo"/&gt;
 *                   &lt;element name="folders" type="{http://www.generated.classes.mediafile.com/soap}Folders"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFilesResponse", propOrder = {
    "errors",
    "success",
    "data"
})
public class GetFilesResponse {

    @XmlElement(required = true)
    protected Errors errors;
    protected boolean success;
    @XmlElement(required = true)
    protected GetFilesResponse.Data data;

    /**
     * Obtiene el valor de la propiedad errors.
     * 
     * @return
     *     possible object is
     *     {@link Errors }
     *     
     */
    public Errors getErrors() {
        return errors;
    }

    /**
     * Define el valor de la propiedad errors.
     * 
     * @param value
     *     allowed object is
     *     {@link Errors }
     *     
     */
    public void setErrors(Errors value) {
        this.errors = value;
    }

    /**
     * Obtiene el valor de la propiedad success.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Define el valor de la propiedad success.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

    /**
     * Obtiene el valor de la propiedad data.
     * 
     * @return
     *     possible object is
     *     {@link GetFilesResponse.Data }
     *     
     */
    public GetFilesResponse.Data getData() {
        return data;
    }

    /**
     * Define el valor de la propiedad data.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFilesResponse.Data }
     *     
     */
    public void setData(GetFilesResponse.Data value) {
        this.data = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="folder" type="{http://www.generated.classes.mediafile.com/soap}FolderInfo"/&gt;
     *         &lt;element name="files" type="{http://www.generated.classes.mediafile.com/soap}FilesInfo"/&gt;
     *         &lt;element name="folders" type="{http://www.generated.classes.mediafile.com/soap}Folders"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "folder",
        "files",
        "folders"
    })
    public static class Data {

        @XmlElement(required = true)
        protected FolderInfo folder;
        @XmlElement(required = true)
        protected FilesInfo files;
        @XmlElement(required = true)
        protected Folders folders;

        /**
         * Obtiene el valor de la propiedad folder.
         * 
         * @return
         *     possible object is
         *     {@link FolderInfo }
         *     
         */
        public FolderInfo getFolder() {
            return folder;
        }

        /**
         * Define el valor de la propiedad folder.
         * 
         * @param value
         *     allowed object is
         *     {@link FolderInfo }
         *     
         */
        public void setFolder(FolderInfo value) {
            this.folder = value;
        }

        /**
         * Obtiene el valor de la propiedad files.
         * 
         * @return
         *     possible object is
         *     {@link FilesInfo }
         *     
         */
        public FilesInfo getFiles() {
            return files;
        }

        /**
         * Define el valor de la propiedad files.
         * 
         * @param value
         *     allowed object is
         *     {@link FilesInfo }
         *     
         */
        public void setFiles(FilesInfo value) {
            this.files = value;
        }

        /**
         * Obtiene el valor de la propiedad folders.
         * 
         * @return
         *     possible object is
         *     {@link Folders }
         *     
         */
        public Folders getFolders() {
            return folders;
        }

        /**
         * Define el valor de la propiedad folders.
         * 
         * @param value
         *     allowed object is
         *     {@link Folders }
         *     
         */
        public void setFolders(Folders value) {
            this.folders = value;
        }

    }

}
