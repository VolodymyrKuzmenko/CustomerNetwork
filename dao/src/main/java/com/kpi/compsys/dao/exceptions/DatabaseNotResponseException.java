package com.kpi.compsys.dao.exceptions;

/**
 * Created by Vova on 12/19/2015.
 */
public class DatabaseNotResponseException extends RuntimeException {



    public DatabaseNotResponseException(String errorMessage){
        super(errorMessage);

    }

    public DatabaseNotResponseException (){
        super();
    }
}
