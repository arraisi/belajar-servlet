/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.contoh.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author arrai
 */
//ANNOTATION
@WebServlet(name = "servletRedirect", urlPatterns = "/hello")
public class ServletRedirect extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //    super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
        String nama = req.getParameter("nama");
        req.setAttribute("namaLengkap", nama);
        RequestDispatcher rd = req.getRequestDispatcher("/belajar.jsp");
        rd.forward(req, resp);
    }
}
