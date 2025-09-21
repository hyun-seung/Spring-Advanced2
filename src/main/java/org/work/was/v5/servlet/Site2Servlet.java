package org.work.was.v5.servlet;

import org.work.was.httpserver.HttpRequest;
import org.work.was.httpserver.HttpResponse;
import org.work.was.httpserver.HttpServlet;

import java.io.IOException;

public class Site2Servlet implements HttpServlet {

    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        response.writeBody("<h1>site2</h1>");
    }
}
