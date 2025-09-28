package org.work.was.v8;

import org.work.was.httpserver.HttpServer;
import org.work.was.httpserver.ServletManager;
import org.work.was.httpserver.servlet.DiscardServlet;
import org.work.was.httpserver.servlet.annotation.AnnotationServletV1;
import org.work.was.httpserver.servlet.annotation.AnnotationServletV3;

import java.io.IOException;
import java.util.List;

public class ServerMainV8 {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        List<Object> controllers = List.of(new SiteControllerV8(), new SearchControllerV8());
//        AnnotationServletV1 annotationServlet = new AnnotationServletV1(controllers);
        AnnotationServletV3 annotationServlet = new AnnotationServletV3(controllers);

        ServletManager servletManager = new ServletManager();
        servletManager.setDefaultServlet(annotationServlet);
        servletManager.add("/favicon.ico", new DiscardServlet());

        HttpServer server = new HttpServer(PORT, servletManager);
        server.start();
    }
}
