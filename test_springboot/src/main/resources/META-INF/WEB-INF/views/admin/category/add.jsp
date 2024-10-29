<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<h2>${category.isEdit ? 'Edit Category' : 'Add New Category'}</h2>
<form action="/admin/categories/Insert" method="post">
    <input type="hidden" value="${category.isEdit}" name="isEdit">
    <input type="hidden" value="${category.categoryId}" name="categoryId"> <!-- Sử dụng đúng tên 'categoryId' như trong lớp Category -->
    <input type="text" name="name" value="${category.name}" placeholder="Category Name">
    <input type="text" name="images" value="${category.images}" placeholder="Images URL">
    <input type="text" name="status" value="${category.status}" placeholder="Status">
    
    <c:if test="${category.isEdit}">
        <input type="submit" value="Update">
    </c:if>
    <c:if test="${!category.isEdit}">
        <input type="submit" value="Insert">
    </c:if>
</form>
