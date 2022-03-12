import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns = "/hello")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        String userName = request.getParameter("userName");
//        String password = request.getParameter("password");
//        System.out.println("UserName is " +userName + "Password is " + password);
//        PrintWriter printWriter = response.getWriter();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        String course = request.getParameter("course");
        String []arr = request.getParameterValues("bike");
        if(arr !=null){
            for(String a : arr){
                System.out.println(a);
            }
        }
        System.out.println(gender);
        System.out.println(course);
        System.out.println("UserName is " +userName + "Password is " + password);
        PrintWriter printWriter = response.getWriter();
        printWriter.println(userName);




    }
}
