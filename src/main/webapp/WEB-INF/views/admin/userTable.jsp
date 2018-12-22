<head>
    <title>Admin Panel</title>
    <link href="/resources/css/bootstrap.min.css" rel="stylesheet" type="text/css" media="all" />
    <script src="/resources/js/jquery.min.js"></script>
    <script src="/resources/js/bootstrap.min.js" type="text/javascript"></script>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

    <style>
        table#userTable {
            width: 90%;
            margin: 0 auto;
        }

    </style>
</head>

<body class="p-3 mb-2 bg-secondary text-white">
    <div class="page-header">
       <center> <h1>Admin Panel</h1> </center>
    </div>
    <table id="userTable" class="table .table-striped table-hover  m-5 p-5">
        <thead class="thead-dark">
            <tr>
                <th scope="col">#</th>
                <th scope="col">UserName</th>
                <th scope="col">FirstName</th>
                <th scope="col">LastName</th>
                <th scope="col">Email</th>
                <th scope="col">Password</th>
                <th scope="col">Edit</th>
            </tr>
        </thead>
        <tbody>
            <c:choose>
                <c:when test="${empty users}">
                    <h2> No user is present.</h2>
                </c:when>
                <c:otherwise>
                    <c:forEach var="user" items="${users}" varStatus="loop">
                        <tr>
                            <td> ${loop.index} </td>
                            <td> ${user.userName} </td>
                            <td> ${user.firstName} </td>
                            <td> ${user.lastName} </td>
                            <td> ${user.userEmail} </td>
                            <td> ${user.secretKey} </td>
                            <td> <a href="#" id="edit_{loop.index}"> Edit </a> </td>
                        </tr>
                    </c:forEach>
                </c:otherwise>
            </c:choose>
        </tbody>
    </table>
</body>