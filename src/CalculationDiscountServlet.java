import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculationDiscountServlet", urlPatterns = "/display-discount")
public class CalculationDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float price= Float.parseFloat(request.getParameter("price"));
        float discount= Float.parseFloat(request.getParameter("discount"));



        float discountAmount= (float) (price* discount*0.1);
        float priceAfterDiscount=price-discountAmount;

        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("<h3> discount amount:"+ discountAmount+"</h3>");
        writer.println("<h3> price after discount:"+ priceAfterDiscount+"</h3>");
        writer.println("</html");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
