public class Gerente extends Funcionario {
 
 private String clave;
 
 public void setClave(String clave) {
  this.clave = clave;
 }
 
 public boolean iniciarSesion(String clave) {
  return clave == "AluraCursosOnline";
 }
 
 /**
  * Sobreescritura de metodo
  *
  * @return salario y bonificación
  */
 @Override
 public double getBonificacion() {
  System.out.println("Ejecutando desde Gerente");
  return super.getSalario() + (this.getSalario() * 0.05);
 }
 
}
