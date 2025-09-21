package org.work.was.v5.servlet;

import org.work.was.httpserver.HttpRequest;
import org.work.was.httpserver.HttpResponse;
import org.work.was.httpserver.HttpServlet;

import java.io.IOException;

public class HomeServlet implements HttpServlet {

    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        response.writeBody("<h1>home</h1>");
        response.writeBody("<ul>");
        response.writeBody("<li><a href='/site1'>site1</a></li>");
        response.writeBody("<li><a href='/site2'>site2</a></li>");
        response.writeBody("<li><a href='/search?q=hello'>검색</a></li>");
        response.writeBody("</ul>");
    }
}
