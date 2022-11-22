<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<body>
	<div>
		<table>
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>나이</th>
					<th>주소</th>
					<th>등록일시</th>
					<th>수정</th>
					<th>삭제</th>
				</tr>
			</thead>
			<c:forEach items="${studentList}" var="student">
				<tbody>
					<tr>
						<td>${student.sid}</td>
						<td>${student.name}</td>
						<td>${student.age}</td>
						<td>${student.addr}</td>
						<td>${student.regDate}</td>

						<td><a href="/insertup?sid=${student.sid}">[수정]</a></td>
						<td><a href="/delete?sid=${student.sid}">[삭제]</a></td>
					</tr>
				</tbody>
			</c:forEach>
		</table>
	</div>
	<div>
		<input type="button" value="등록" onclick="location.href='/insertForm';"/>
	</div>
</body>
</html>




