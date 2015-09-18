package oficinaMecanica.controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import oficinaMecanica.models.Veiculo;


public class VeiculoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/jsp/cadastroVeiculo.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca(request.getParameter("placa")); // parametro que esta no campo name
        veiculo.setTipo(request.getParameter("tipo"));
        
        veiculoManager manager;
        manager = new VeiculoManagerImpn();
        manager.cadastrar(veiculo);

    }

}
