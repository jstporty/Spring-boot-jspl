<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
					<td><input type="hidden" name="sid" value="${student.sid}" /><td>
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

		<c:choose>
			<c:when test="${sid!=null}">
				<input type="button" value="수정"
					onclick="document.forms['insertForm'].submit();" />
			</c:when>
			<c:when test="${sid==null}">
				<input type="button" value="등록${param!=null}+${sid}"
					onclick="document.forms['insertForm'].submit();" />
			</c:when>
		</c:choose>
		
		<input type="button" value="취소" onclick="history.back();" />
	
</body>
</html>