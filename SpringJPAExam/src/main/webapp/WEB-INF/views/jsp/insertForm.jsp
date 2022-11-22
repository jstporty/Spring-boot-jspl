<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<body>
	<div>
		<table>
			<c:choose>
				<c:when test="${sid==null}">
					<form name="insertForm" action="/insert" method="post">
				</c:when>
				<c:when test="${sid!=null}">
					<form name="insertForm" action="/update" method="post">
				</c:when>
			</c:choose>
			<tbody>
				<tr>
					<td>이름</td>
					<td><input type="text" name="name" value="${student.name}" /></td>
					<td><input type="hidden" name="sid" value="${student.sid}" />
					<td>
				</tr>
				<tr>
					<td>나이</td>
					<td><input type="text" name="age" value="${student.age}" /></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="addr" value="${student.addr}" /></td>
				</tr>
			</tbody>
			</form>

		</table>
	</div>
	<div>
		<c:choose>
			<c:when test="${!empty param.sid}">
				<input type="button" value="수정"
					onclick="document.forms['insertForm'].submit();" />
			</c:when>
			<c:when test="${empty param.sid}">
				<input type="button" value="등록"
					onclick="document.forms['insertForm'].submit();" />
			</c:when>
		</c:choose>
		<input type="button" value="취소" onclick="history.back();" />
	</div>
</body>
</html>