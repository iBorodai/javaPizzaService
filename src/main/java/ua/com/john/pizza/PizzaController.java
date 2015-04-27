/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.john.pizza;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Иван Бородай
 */
public class PizzaController extends HttpServlet{

    @Override
    public void init() throws ServletException {
        //super.init(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Servlet up at "+new Date());
    }

    @Override
    public void destroy() {
        //super.destroy(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Servlet down at "+new Date());
    }
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text-html");
        resp.setCharacterEncoding("UTF-8");
        
        HttpSession session = req.getSession();
        
        Integer count = (Integer) session.getAttribute("count");
        if( count != null ) count++; else count = 0;
        
        String prm = req.getParameter("status");
        if( prm == null ) prm = "def";
        
System.out.println( prm );

        String outRes;
        switch( prm ){
            case "fun": outRes = "Просто праздник какой-то"; break;
            case "sad": outRes = "Печаааль"; break;
            default: outRes = "Не понятное настроение";
        }
        
        session.setAttribute("status", prm);        
        session.setAttribute( "count", count );
        
        try ( PrintWriter out = resp.getWriter() ) {
            out.println("<meta charset=\"UTF-8\">" );
            out.println("сегодня: "+new Date() );
            out.println(outRes);
            out.println("Просмотрено "+count+" раз");            
            //String filePath = "src/main/webapp/tpl.html";
            //String outHtml = new String(Files.readAllBytes(filePath)) or Files.readAllLines(filePath);
        }
    }
}
