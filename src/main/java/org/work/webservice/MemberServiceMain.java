package org.work.webservice;

import org.work.io.member.MemberRepository;
import org.work.io.member.impl.FileMemberRepository;
import org.work.was.httpserver.HttpServer;
import org.work.was.httpserver.ServletManager;
import org.work.was.httpserver.servlet.DiscardServlet;
import org.work.was.httpserver.servlet.annotation.AnnotationServletV3;

import java.io.IOException;
import java.util.List;

public class MemberServiceMain {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        MemberRepository memberRepository = new FileMemberRepository();
        MemberController memberController = new MemberController(memberRepository);
        AnnotationServletV3 servlet = new AnnotationServletV3(List.of(memberController));
        ServletManager servletManager = new ServletManager();
        servletManager.add("/favicon.ico", new DiscardServlet());
        servletManager.setDefaultServlet(servlet);

        HttpServer server = new HttpServer(PORT, servletManager);
        server.start();
    }
}
