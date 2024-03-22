package com.proyecto.casa_de_cambios.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Empleados", urlPatterns = {"/Empleados"})
public class Empleados extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }


   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String id = request.getParameter("id");
       String cedula = request.getParameter("cedula");
       String nombre = request.getParameter("nombre");
       String apellido = request.getParameter("apellido");
       String cargo = request.getParameter("cargo");
       String direccion = request.getParameter("direccion");
       String telefono = request.getParameter("telefono");
       
        System.out.println("Id es: "+ id);
        System.out.println("Cedula es: "+ cedula);
        System.out.println("Nombre es: "+ nombre);
        System.out.println("Apellido es: "+ apellido);
        System.out.println("Cargo es: "+ cargo);
        System.out.println("Direccion es: "+ direccion);
        System.out.println("Telefono es: "+ telefono);
       
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
