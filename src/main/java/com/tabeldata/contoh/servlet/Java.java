package com.tabeldata.contoh.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//SERVLET
public class Java extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
//COBA REQUEST

        String namaLengkap = req.getParameter("nama");
        String kelas = req.getParameter("kelas");
        Integer umur = Integer.valueOf(req.getParameter("umur"));
//COBA RESPONES      
        resp.getWriter().append("<html>"
                + "<head>"
                + "<title>Belajar Kirim Nilai</title>"
                + "</head>"
                + "<body>Nama Lengkap:" + namaLengkap + "<br/>"
                + "Kelas:" + kelas + "<br/>"
                + "Umur:" + umur + "<br/>"
                + "</body>"
                + "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
//COBA REQUEST
        String namaLengkap = req.getParameter("nama");
        String kelas = req.getParameter("kelas");
        Integer umur = Integer.valueOf(req.getParameter("umur"));
//COBA RESPONES      
        resp.getWriter().append("<html>"
                + "<head>"
                + "<title>Belajar Kirim Nilai</title>"
                + "</head>"
                + "<body>Nama Lengkap:" + namaLengkap + "<br/>"
                + "Kelas:" + kelas + "<br/>"
                + "Umur:" + umur + "<br/>"
                + "</body>"
                + "</html>");
    }

}
