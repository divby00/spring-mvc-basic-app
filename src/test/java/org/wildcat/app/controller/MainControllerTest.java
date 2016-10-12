package org.wildcat.app.controller;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;
import org.wildcat.app.service.ProductService;
import org.wildcat.app.service.SimpleProductService;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class MainControllerTest {

    @Test
    @Ignore
    public void testHandleRequestView() throws Exception {
        MainController controller = new MainController();
        ProductService productManager = new SimpleProductService();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("main", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        Map<String, Object> model = (Map<String, Object>) modelAndView.getModel().get("data");
        assertNotNull(model);
    }
}