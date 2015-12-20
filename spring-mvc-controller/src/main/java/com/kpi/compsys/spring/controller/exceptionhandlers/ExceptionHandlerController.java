package com.kpi.compsys.spring.controller.exceptionhandlers;

import com.kpi.compsys.dao.exceptions.DatabaseNotResponseException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Vova on 12/19/2015.
 */

@ControllerAdvice
public class ExceptionHandlerController {
    private static final Logger logger = LogManager.getLogger(ExceptionHandlerController.class);

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)  // 500
    @ExceptionHandler(DatabaseNotResponseException.class)
    public ModelAndView handleCustomException(DatabaseNotResponseException ex) {
        logger.warn(ex.getMessage());
        ModelAndView model = new ModelAndView("exception");
        model.addObject("errorCode", "500");
        model.addObject("exception", ex);

        return model;

    }

}
