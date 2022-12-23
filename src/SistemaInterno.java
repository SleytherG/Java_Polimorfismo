public class SistemaInterno {
 
 private String clave = "AluraCursosOnline";
 public boolean autentica(FuncionarioAutenticable funcionarioAutenticable) {
  boolean puedeIniciarSesion = funcionarioAutenticable.iniciarSesion(clave);
  if ( puedeIniciarSesion ) {
   System.out.println("Login exitoso");
   return true;
  } else {
   System.out.println("Error de Login");
   return false;
  }
 }
}
