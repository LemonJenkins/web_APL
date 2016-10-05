import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/Calc")
public class CalculatorServ extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Calculator calculator = new Calculator();
        int rezultat = 0;
        StringBuilder SB = new StringBuilder();
        String[] viragenie = new String[4];
        viragenie[0] = request.getParameter("num1");
        viragenie[1] = request.getParameter("znak");
        viragenie[2] = request.getParameter("num2");
        try {
            rezultat = calculator.start(viragenie);
            SB.append(viragenie[0]).append(viragenie[1]).append(viragenie[2]).append(" = ").append(rezultat);

        } catch (Exception e) {
            SB.append("!!!!!!EBAT TI LOH HA HA HA!!!!!!").append(e.getMessage());

        }
        request.setAttribute("message", SB.toString());

//        request.setAttribute("message", viragenie[0]);
//        request.setAttribute("message1", viragenie[1]);
//        request.setAttribute("message2", viragenie[2]);
//        request.setAttribute("message3", rezultat);
        getServletContext().getRequestDispatcher("/CalcView.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
