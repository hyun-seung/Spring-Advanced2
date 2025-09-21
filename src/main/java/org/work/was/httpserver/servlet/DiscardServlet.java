package org.work.was.httpserver.servlet;

import org.work.was.httpserver.HttpRequest;
import org.work.was.httpserver.HttpResponse;
import org.work.was.httpserver.HttpServlet;

import java.io.IOException;

public class DiscardServlet implements HttpServlet {

    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        // empty
    }
}
