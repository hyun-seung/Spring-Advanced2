package org.work.was.v5.servlet;

import org.work.was.httpserver.HttpRequest;
import org.work.was.httpserver.HttpResponse;
import org.work.was.httpserver.HttpServlet;

import java.io.IOException;

public class SearchServlet implements HttpServlet {

    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        String query = request.getParameter("q");
        response.writeBody("<h1>Search</h1>");
        response.writeBody("<ul>");
        response.writeBody("<li>query: " + query + "</li>");
        response.writeBody("</ul>");
    }
}
