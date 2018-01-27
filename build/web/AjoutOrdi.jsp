<%-- 
    Document   : AjoutOrdi
    Created on : Jan 20, 2018, 12:22:44 PM
    Author     : Cheikh
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <form method="post" action="${pageContext.request.contextPath}/Ordi">

            <!-- nom complet -->
            <div class="form-group">
                <label for="name">Reference<span class="text-danger">*</span> </label>
                <input type="text" class="form-control" name="ref" value=""
                       required=required/>
            </div>

            <!-- nom complet -->
            <div class="form-group">
                <label for="name">Marque<span class="text-danger">*</span> </label>
                <input type="text" class="form-control" name="mark" value=""

                       required=required/>
            </div>

            <!-- nom complet -->

            <!-- Pseudo -->
            <div class="form-group" >
                <label for="pseudo">Taille de la Ram<span class="text-danger">*</span> </label>
                <input type="number" class="form-control" name="ram" value=""

                       required=required placeholder="La ram est en GO"/>
            </div>

            <!-- Email -->
            <div class="form-group">
                <label for="email">Taille Disque<span class="text-danger">*</span> </label>
                <input type="number" class="form-control" name="disk" value=""

                       required=required placeholder="Le disque est en GO"/>
            </div>

            <div class="form-group">
                <label for="adresse">Système d'exploitation<span class="text-danger">*</span> </label>
                <select name="os">
                    <c:forEach var="item" items="${lesOs}">
                        <option value="<c:out value="${item.id}"/>"><c:out value="${item.nom}"/><c:out value=" "/> <c:out value="${item.version}"/></option>
                    </c:forEach>

                </select>
            </div>

            <div class="form-group">
                <label for="adresse">Matricule <span class="text-danger">*</span> </label>
                <select name="us">


                </select>
            </div>


            <!-- Bouton validation-->
            <button type="submit" class="btn btn-success" name="ajouter">Valider les informations</button>

        </form>


    </body>
</html>


