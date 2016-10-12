package org.wildcat.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.wildcat.app.common.AppException;
import org.wildcat.app.domain.Product;
import org.wildcat.app.service.ProductService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class MainController extends BaseController {

    @Autowired
    private ProductService productManager;

    @RequestMapping(value="/main.html")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
        try {
            Map<String, Object> data = new HashMap<>();
            List<Product> products = productManager.getProducts();
            data.put("products", products);
            return new ModelAndView("main", "data", data);
        } catch (Exception e) {
            logger.error(ExceptionUtils.getStackTrace(e));
            throw new AppException("000", "Exception in MainController:main.html", e);
        }
    }
}