package com.kpi.compsys.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Vova on 11/27/2015.
 */
@Entity
@Table(name="File")
public class File implements Serializable {
    private Integer idFile;

    @Id
    @GeneratedValue
    @Column(name = "idFile")
    public Integer getIdFile() {
        return idFile;
    }

    public void setIdFile(Integer idFile) {
        this.idFile = idFile;
    }
    @Column(name = "fileName")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    @Column(name = "pathToFile")
    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    private String fileName;
    private String pathToFile;

}
