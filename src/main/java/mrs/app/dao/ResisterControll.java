package mrs.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import mrs.domain.service.room.RoomService;
import mrs.domain.service.user.CustomerResisterServlet;

@Controller
public class ResisterControll {
	@Autowired
	CustomerResisterServlet customerResisterServet;
	@RequestMapping("resister")
	String resister() {
		return "jsp/resister";
	}
}


/* https://skill-for-it.com/java_webapp_4/の場合
package mrs.app.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import config.DBconfig;
import dto.Customer;
import dto.LoginUser;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import mrs.domain.model.*;
import mrs.domain.service.reservation.*;
import mrs.domain.service.room.RoomService;
import mrs.domain.service.user.ReservationUserDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


//顧客情報を登録するメソッド
		public void insert_customer_info(String first_name, String last_name, String password) throws FileNotFoundException {
			String[] DbInfo = config.getDBinfo(file_path);
			String url = DbInfo[0];
			String db_user_name = DbInfo[1];
			String db_password = DbInfo[2];

			String sql = "insert into "
					+ "customer_tb(first_name, last_name, password) "
					+ "values (?,?,?)";

			try(Connection conn = DriverManager.getConnection(url,db_user_name,db_password)){
				conn.setAutoCommit(false);
				try(PreparedStatement stmt = conn.prepareStatement(sql)){
					//変数sqlの一番目の?に引数のfirst_nameをセットする
					stmt.setString(1, first_name);
					//変数sqlの二番目の?に引数のlast_nameをセットする
					stmt.setString(2, last_name);
					//変数sqlの三番目の?に引数のpasswordをセットする
					stmt.setString(3, password);
					stmt.executeUpdate();
					conn.commit();
				} catch(Exception e) {
					conn.rollback();
					System.out.println("データ処理が正常に終了しなかったため、RollBackを行いました");
					throw e;
				}
			} catch (SQLException e1) {
				System.out.println("SQLの例外が発生しました");
				e1.printStackTrace();
			}
		}
	}

*/