public class TestControlBonificacion {
 public static void main(String[] args) {
  Funcionario diego = new Contador();
  diego.setSalario(2000);
  diego.setNombre("Diego");
  
  Gerente jimena = new Gerente();
//  jimena.setSalario(10000);
//  jimena.setNombre("Jimena");
  
  Contador alexis = new Contador();
  alexis.setSalario(100);
  alexis.setNombre("Alexis");
  
  ControlBonificacion controlBonificacion = new ControlBonificacion();
  controlBonificacion.registrarSalario(diego);
//  controlBonificacion.registrarSalario(jimena);
  controlBonificacion.registrarSalario(alexis);
 }
}
