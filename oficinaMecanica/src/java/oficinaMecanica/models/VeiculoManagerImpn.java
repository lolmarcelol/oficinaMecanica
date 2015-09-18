
package oficinaMecanica.models;


public class VeiculoManagerImpn implements VeiculoManager {

    @Override
    public Veiculo cadastrar(Veiculo veiculo) {
    IDaoManager manager;
          manager = new JdbcDaoManager();

          try{
              manager.iniciar();
              VeiculoDAO dao = manager.getClienteDao();
              Cliente c ;
              c = dao.inserir(veiculo);
              manager.confirmarTransação();
              manager.encerrar();
              return c;
          }catch(Exception ex){
              manager.abortarTransação();
              throw ex;
          }               
       }
}


