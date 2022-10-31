package mrs.domain.service.user;

import java.util.Collection;
import mrs.domain.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;



import java.io.IOException;
import java.sql.SQLData;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* https://skill-for-it.com/java_webapp_4/からほぼ引用 */

@WebServlet("/CustomerResisterServlet/")
public class CustomerResisterServlet<sqlData> extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher_list =
				request.getRequestDispatcher("templates/jsp/register.jsp");
		dispatcher_list.forward(request, response);
		

}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//文字コードの設定
	response.setContentType("text/html; charset=UTF-8");
	request.setCharacterEncoding("UTF-8");
	
	//顧客登録画面で入力された値をパラメーターで取得
	String first_name = request.getParameter("first_name");
	String last_name = request.getParameter("last_name");
	String password = request.getParameter("password");
	
	sqlData sql = new sqlData();
	
	//顧客情報を登録するメソッドの呼び出し
	//sql.insert_customer_info(first_name, last_name, password);
	
	/* 下記不必要？
	//全ての顧客情報を取得し、顧客管理一覧画面に遷移する
	List<Customer> customer_data = new ArrayList<Customer>();
	customer_data = sql.get_customer_info();
	request.setAttribute("customer", customer_data);
	
	//顧客画面に遷移
	RequestDispatcher dispatcher =
			request.getRequestDispatcher("templates/login/loginForm.html");
	dispatcher.forward(request, response);
	*/
}
}