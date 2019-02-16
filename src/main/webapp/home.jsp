<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OnlineKart</title>
<link href="bootstrap/css/shop-homepae.css" rel="stylesheet" />
<link href="bootstrap/css/bootstrap.css" rel="stylesheet" />
<link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet" />
<script src="bootstrap/scripts/jquery-1.7.1.min.js"></script>
<script src="bootstrap/js/bootstrap.js"></script>
<style>
#cartitem {
	display: inline;
}

#welcome {
	display: inline;
	height: 20px;
}

#Login {
	display: inline;
	height: 20px;
}
</style>
</head>
<body>
	<!--Header-->
	<nav class="navbar navbar-inverse" role="navigation">
	<div class="navbar-inner">
		<c:url var="home" value="/home" />
		<a class="brand" href="${home}">The Pirate Shop</a> <a
			class="btn btn-navbar" data-toggle="collapse"
			data-target=".nav-collapse"> <span class="icon-bar"></span> <span
			class="icon-bar"></span> <span class="icon-bar"></span>
		</a>

		<div class="nav-collapse collapse">
			<ul class="nav">
				<c:forEach var="categories" items="${categories}">
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#"> <c:out
								value="${categories.key}" /></b>
					</a>

						<ul class="dropdown-menu">
							<c:forEach var="subcategories" items="${categories.value}">
								<c:url var="url" value="/category">
									<c:param name="subcat" value="${subcategories}" />
									<c:param name="categ" value="${categories.key}" />
								</c:url>
								<li><a tabindex="-1" href="${url}"><c:out
											value="${subcategories}" /></a></li>
							</c:forEach>
						</ul></li>
				</c:forEach>
			</ul>
			<ul class="nav pull-right">
				<li class="dropdown"><a id="cartitem" class="dropdown-toggle"
					data-toggle="dropdown" href="#"><span id="itemcount"
						class="btn btn-default btn-sm"><i
							class="icon-shopping-cart icon-red"></i> <c:set var="cartItems"
								scope="session" value="${cart.numberOfItems}" /> <span
							class="headerCartItemsCount"> <c:choose>
									<c:when test="${empty cartItems}">0
							</c:when>
									<c:otherwise>
										<c:out value="${cartItems}" />
									</c:otherwise>
								</c:choose>
						</span> <span class="headerCartItemsCountWord"><c:out
									value="${cartItems==1?'item':'items'}" /></span> <b class="caret"></b></span></a>
					<ul class="dropdown-menu">
						<c:url var="cart" value="/cart" />
						<li><a tabindex="-1" href="${cart}">View Cart</a></li>
						<li><a tabindex="-1" href="checkout_unreg.jsp">Checkout
								Cart</a></li>
					</ul></li>
				<li class="dropdown"><c:choose>
						<c:when test="${empty email}">
							<a href="login-register.jsp"><b>Login/Register</b></a>
						</c:when>
						<c:otherwise>
							<a class="dropdown-toggle" data-toggle="dropdown" href="#"><span
								id="welcome" class="btn btn-default btn-sm"><c:out
										value="Hello User${email}" /><b class="caret"></b></span></a>
							<ul class="dropdown-menu">
								<li><a tabindex="-1" href="/">Account</a></li>
								<li><a tabindex="-1" href="/">Orders</a></li>
								<c:url var="logout" value="/logout" />
								<li><a tabindex="-1" href="${logout}">Sign out</a></li>
							</ul>
						</c:otherwise>
					</c:choose></li>
			</ul>
		</div>
	</div>
	</nav>

	<!-- Body -->
		<center>
		<div class="container">
			<div class="row">
				<div class="span12">
					<c:forEach var="products" items="${productsList}">
						<c:url var="url" value="/product">
							<c:param name="productId" value="${products.productId}" />
						</c:url>
						<div class="span3">
							<img src="images/small/${products.productId}.jpg"/></br> <a href="${url}">${products.productName}</a>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
		</center>
	</div>
</body>
</html>
