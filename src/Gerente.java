public class Gerente extends Funcionario implements Autenticable {
 
 /**
  * Sobreescritura de metodo
  *
  * @return salario y bonificación
  */
 @Override
 public double getBonificacion() {
  System.out.println("Ejecutando desde Gerente");
  return 2000;
 }
 
 @Override
 public void setClave(String clave) {
 
 }
 
 @Override
 public boolean iniciarSesion(String clave) {
  return false;
 }
}
