import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Ads", urlPatterns = "/ads")
public class AdsServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		Ads ads = DaoFactory.getAdsDao();

		List<Ad> ad = ads.all();

		request.setAttribute("ads", ad);
		request.getRequestDispatcher("/ads/index.jsp").forward(request, resp);
	}
}
