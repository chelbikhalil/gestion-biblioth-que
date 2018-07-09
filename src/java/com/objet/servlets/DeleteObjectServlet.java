/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objet.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Laptop
 */
@WebServlet(name = "DeleteObjectServlet", urlPatterns = {"/DeleteObjectServlet"})
public class DeleteObjectServlet extends HttpServlet {

    
    
    
      Connection connexion=null;
    String user=null;
    String pass=null;
    public void init(){
        System.out.println("-----------------------------------------");
        System.out.println("init method has been called abd servelet is initialized");
        System.out.println("-----------------------------------------");
        String url="jdbc:mysql://127.0.0.1:3306/bibliotheque";
        String name="root";
        String pwd="";
        String driver="com.mysql.jdbc.Driver";
        try{
            Class.forName(driver).newInstance();
            connexion=DriverManager.getConnection(url, name, pwd);
        }catch(Exception e){
            System.out.println("Error while loading");
        }
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DeleteObjectServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DeleteObjectServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    Object objet= new Object();
            String id_doc=request.getParameter("id");
            String lib_doc=request.getParameter("libellé");
            
            
            
           
            String q="DELETE FROM `personne` WHERE id_objet='"+id_doc+"'";
          Statement commande;
          try {
              commande = connexion.createStatement();
              int  rs=commande.executeUpdate(q);
         this.getServletContext().getRequestDispatcher("/suppsuccés").forward(request, response);
          }
                        catch (SQLException ex) {
              Logger.getLogger(DeleteObjectServlet.class.getName()).log(Level.SEVERE, null, ex);
          }
            
                    }
                
    
    
    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
