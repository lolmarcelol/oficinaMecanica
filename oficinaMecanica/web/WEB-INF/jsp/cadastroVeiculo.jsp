
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro de Veículo</h1>
        <form action="cadastro" method="POST">
            <label for="placa" id="placa"> Placa </label>
            <input type="text" id="placa" name="placa"/> 
            <select name="tipo" id="tipo">
                <option>Selecione</option>
                <option>Caminhão</option>
                <option>Carro</option>
                <option>Moto</option>
            </select>
            <br><input type="submit" value="salvar"/>
        </form>
    </body>
</html>
