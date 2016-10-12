package org.wildcat.app.controller;


import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.wildcat.app.common.AppException;

import java.util.HashMap;
import java.util.Map;

public class BaseController {

    protected final Log logger = LogFactory.getLog(getClass());

    @ExceptionHandler(AppException.class)
    public ModelAndView handleExceptions(AppException exception) {
        Map<String, Object> data = new HashMap<>();
        data.put("exception", ExceptionUtils.getStackTrace(exception.getException()));
        data.put("errorCode", exception.getErrorCode());
        data.put("errorMessage", exception.getErrorMessage());
        return new ModelAndView("error/error", "data", data);
    }

}
