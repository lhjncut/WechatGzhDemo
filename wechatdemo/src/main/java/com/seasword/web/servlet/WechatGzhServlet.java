package com.seasword.web.servlet;

import com.seasword.web.wechat.DemoApp;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/4/10.
 */
public class WechatGzhServlet extends HttpServlet {

    //private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    private Logger logger = Logger.getLogger(this.getClass());

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        logger.info("enter doPost()");

        String result = "";        
        
        try{        
        	DemoApp cr = new DemoApp(request);

        	result = cr.handlePost();
        }
        catch(Exception e)
        {
        	logger.error(e.getMessage(), e);
        	result = e.getMessage();
        }
        
        logger.info("result="+result);
        
        response.getOutputStream().write(result.getBytes());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        logger.info("enter doGet()");
        String result = "";        
        
        try{        
        	DemoApp cr = new DemoApp(request);

        result = cr.handleGet();
        }
        catch(Exception e)
        {
        	logger.error(e.getMessage(), e);
        	result = "error";
        }
        
        logger.info("result="+result);
        
        response.getOutputStream().write(result.getBytes());
    }
}
