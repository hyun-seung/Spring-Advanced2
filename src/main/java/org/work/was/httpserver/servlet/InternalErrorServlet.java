package org.work.was.httpserver.servlet;

import org.work.was.httpserver.HttpRequest;
import org.work.was.httpserver.HttpResponse;
import org.work.was.httpserver.HttpServlet;

import java.io.IOException;

public class InternalErrorServlet implements HttpServlet {

    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        response.setStatusCode(500);
        response.writeBody("<h1>Internal Error</h1>");
    }
}
