import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ServletExample extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");

        PrintWriter pw = res.getWriter();  // ✅ Fix: Corrected "printWriter" to "PrintWriter" and added type

        pw.println("<html><head></head>"); // ✅ Fix: Added semicolon
        pw.println("<body><h1>Hello, Welcome to Servlet</h1>"); // ✅ Fix: Closed <h1> tag
        pw.println("</body></html>");

        pw.close();
    }
}
