public class TestReferencias {
 public static void main(String[] args) {
  // Elemento más generico puede ser adaptado al elemento más especifico.
  Funcionario funcionario = new Gerente();
  funcionario.setNombre("Diego");
  
  
  Gerente gerente = new Gerente();
  gerente.setNombre("Jimena");
  
  funcionario.setSalario(2000);
  gerente.setSalario(10000);
 }
}