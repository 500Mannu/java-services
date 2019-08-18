/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import ac.za.tut.model.Citizen;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.business.CitizenDetailsLocal;

/**
 *
 * @author Manny
 */
public class AddUserDetailsServlet extends HttpServlet {
    @EJB
    private CitizenDetailsLocal citizenDetails;

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
        
        //get data from request object
        String idnumber = request.getParameter("idno"); //9109215610080
        
        Citizen details = citizenDetails.getCitizenDetails(idnumber);
        
        request.setAttribute("idno", idnumber);
        request.setAttribute("age", details.getAge());
        request.setAttribute("gender", details.getGender());
        request.setAttribute("dob", details.getDob());
        request.setAttribute("status", details.getStatus());
        RequestDispatcher disp = request.getRequestDispatcher("student.jsp");
        disp.forward(request, response);
    }
}
