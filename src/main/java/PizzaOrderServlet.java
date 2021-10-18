import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String size = req.getParameter("size");
		String crust = req.getParameter("crust");
		String sauce = req.getParameter("sauce");
		String[] toppings = req.getParameterValues("toppings");
		System.out.println(size);
		System.out.println(crust);
		System.out.println(sauce);
		for (String topping : toppings){
			System.out.println(topping);
		}
	}
}
