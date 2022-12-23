public class TestSistemaInterno {
 public static void main(String[] args) {
  SistemaInterno sistemaInterno = new SistemaInterno();
  Gerente gerente1 = new Gerente();
  Administrador administrador = new Administrador();
  
  sistemaInterno.autentica(gerente1);
  sistemaInterno.autentica(administrador);
 }
}
