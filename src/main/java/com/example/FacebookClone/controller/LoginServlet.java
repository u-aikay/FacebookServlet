package com.example.FacebookClone.controller;

import com.example.FacebookClone.DOA.UserDatabase;
import com.example.FacebookClone.dbConnectionProvider.DbConnection;
import com.example.FacebookClone.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

 @WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    /**
     * Servlet method for user login
     * @param request
     * @param response
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        HttpSession httpSession = request.getSession();

        //get request data
        String numEmail = request.getParameter("numEmail");
        String password = request.getParameter("password");

        //from user DOA
        UserDatabase userDatabase = new UserDatabase(DbConnection.getConnection());
        User user = userDatabase.loginUser(numEmail, password);

        if(user != null){
            httpSession.setAttribute("user", user);
            response.sendRedirect("home.jsp");
        }else{
            httpSession.setAttribute("Registration Error", "User not found, Enter Correct Password or Email");
            response.sendRedirect("index.jsp");
        }
    }
}
