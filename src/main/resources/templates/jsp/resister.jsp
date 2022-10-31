<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
<title>顧客登録画面</title>
</head>
<body>
    <div class="mx-auto" style="width: 300px;"></div>
    <h1 class="mb-3" style="text-align: center">顧客登録</h1>
    <form action="<%= request.getContextPath() %>/CustomerRegisterServlet" method="post">
      <div class="mb-3">
        <label for="first_name" class="form-label">名前</label>
        <input type="text" class="form-control" id="first_name" name="first_name">
      </div>
      <div class="mb-3">
        <label for="last_name" class="form-label">名字</label>
        <input type="text" class="form-control" id="last_name" name="last_name">
      </div>
      <div class="mb-3">
        <label for="password" class="form-label">パスワード</label>
        <input type="text" class="form-control" id="password" name="password">
      </div>
      <button type="submit" class="btn btn-primary">登録</button>
	</form>
    <!--
    <div style="text-align:center;">
        <a href="<%=request.getContextPath() %>/CustomerServlet">顧客管理一覧</a>
    </div>
    -->
</div>
</body>
</html>