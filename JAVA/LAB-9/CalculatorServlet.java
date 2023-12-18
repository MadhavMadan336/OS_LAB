package lab;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class CalculatorServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Result</title></head><body>");
        
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        String operation = request.getParameter("operation");
        
        try {
            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);
            double result = 0;

            if (operation.equals("addition")) {
                result = num1 + num2;
            } else if (operation.equals("subtraction")) {
                result = num1 - num2;
            } else if (operation.equals("multiplication")) {
                result = num1 * num2;
            } else if (operation.equals("division")) {
                result = num1 / num2;
            }

            out.println("<h2>Result: " + result + "</h2>");
        } catch (NumberFormatException e) {
            out.println("<h2>Error: Invalid input. Please enter numeric values.</h2>");
        }
        
        out.println("</body></html>");
    }
}
