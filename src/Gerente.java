public class Gerente extends FuncionarioAutenticable {
 
 /**
  * Sobreescritura de metodo
  *
  * @return salario y bonificación
  */
 public double getBonificacion() {
  System.out.println("Ejecutando desde Gerente");
  return 2000;
 }
 
}
