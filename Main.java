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

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String id = request.getParameter("id");
            if (id == null || id.isEmpty()) {
                out.println("Error: ID is required.");
                return;
            }

            String cedula = request.getParameter("cedula");
            if (cedula == null || cedula.isEmpty()) {
                out.println("Error: Cedula is required.");
                return;
            }

            String nombre = request.getParameter("nombre");
            if (nombre == null || nombre.isEmpty()) {
                out.println("Error: Nombre is required.");
                return;
            }

            String apellido = request.getParameter("apellido");
            if (apellido == null || apellido.isEmpty()) {
                out.println("Error: Apellido is required.");
                return;
            }

            String cargo = request.getParameter("cargo");
            if (cargo == null || cargo.isEmpty()) {
                out.println("Error: Cargo is required.");
                return;
            }

            String direccion = request.getParameter("direccion");
            if (direccion == null || direccion.isEmpty()) {
                out.println("Error: Direccion is required.");
                return;
            }

            String telefono = request.getParameter("telefono");
            if (telefono == null || telefono.isEmpty()) {
                out.println("Error: Telefono is required.");
                return;
            }

            out.println("Empleado added successfully.");
            out.println("Id: " + id);
            out.println("Cedula: " + cedula);
            out
