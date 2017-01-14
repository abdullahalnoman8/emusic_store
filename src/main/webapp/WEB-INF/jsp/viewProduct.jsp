<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: noman
  Date: 12/27/16
  Time: 5:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/jsp/templet/header.jsp"%>

<!-- Marketing messaging and featurettes
================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->

<div class="container-wrapper">

  <div class="container">/

    <div class="page-header">
      <h1>Product Details </h1>

      <p class="lead">Here is the detail information of the product</p>


    </div>

    <div class="container">

      <div class="row">
        <div class="col-md-5">
            <img src="#" alt="image" style="width: 100% ;height: 300px"/>

        </div>
        <div class="col-md-5">
           <h3>${product.productName}</h3>
           <p><strong>Description :</strong> ${product.productDescription}</p>
           <p><strong>Manufacturer : </strong> ${product.productMenufacturer}</p>
           <p><strong>Category :</strong> ${product.productCategory}</p>
           <p><strong>Condition :</strong> ${product.productCondition}</p>
           <%--<p>${product.productPrice}</p>--%>
           <h4>${product.productPrice}</h4>
        </div>
      </div>

    </div>


   <%-- <table class="table table-striped table-hover ">
      <thead>
      <tr class="bg-success">
        <th>Photo Thumb</th>
        <th>Product Name</th>
        <th>Category</th>
        <th>Condition</th>
        <th>Price</th>
      </tr>
      </thead>
      <c:forEach items="${products}" var="product">
        <tr>
          <td><img src="#"/></td>
          <td>${product.productName}</td>
          <td>${product.productCategory}</td>
          <td>${product.productCondition}</td>
          <td>${product.productPrice} BDT</td>
        </tr>
      </c:forEach>

    </table>--%>


<%@include file="/WEB-INF/jsp/templet/footer.jsp"%>