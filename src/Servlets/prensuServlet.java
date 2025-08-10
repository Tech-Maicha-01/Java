import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class prensuServlet extends HttpServlet {

    // Handles POST request
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Set content type
        response.setContentType("text/html; charset=UTF-8");

        // Get writer
        try (PrintWriter out = response.getWriter()) {
            // Extract form data
            String name = request.getParameter("username");

            // Write response
            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Welcome</title></head><body>");
            out.println("<h2>Hello, " + escapeHtml(name) + "!</h2>");
            out.println("</body></html>");
        }
    }

    // Handles GET request
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    // Optional: helper method to escape HTML to prevent XSS
    private String escapeHtml(String input) {
        if (input == null) return "";
        return input.replace("&", "&amp;")
                    .replace("<", "&lt;")
                    .replace(">", "&gt;")
                    .replace("\"", "&quot;")
                    .replace("'", "&#x27;");
    }
}
