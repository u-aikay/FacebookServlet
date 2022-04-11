package com.example.FacebookClone.controller;

import com.example.FacebookClone.DOA.LikeDataBase;
import com.example.FacebookClone.DOA.PostDatabase;
import com.example.FacebookClone.dbConnectionProvider.DbConnection;
import com.example.FacebookClone.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LikeServlet", value = "/LikeServlet")
public class LikeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    /**
     * Servlet method for like
     * @param request
     * @param response
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try(PrintWriter out = response.getWriter();){
            out.println("<html><body>");
            out.println("<h1>" + "Servlet Registration example" + "</h1>");
            out.println("</body></html>");

            //fetch data from post form client
            int action = Integer.parseInt(request.getParameter("action"));
            int postId = Integer.parseInt(request.getParameter("postId"));

            //get current user
            HttpSession httpSession = request.getSession();
            User user = (User) httpSession.getAttribute("user");

            //from like DOA
            LikeDataBase likeDataBase = new LikeDataBase(DbConnection.getConnection());

            if(likeDataBase.likePost(user.getId(), postId, action)){
                response.getWriter().write("Success liking/disliking post");
            }else{
                out.print("500 error");
                response.getWriter().write("Failed do liking post");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
