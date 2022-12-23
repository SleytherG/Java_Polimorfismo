public class Cuenta {
 private double saldo;
 private int agencia;
 private int numero;
 private Cliente titular = new Cliente();
 
 private static int total = 0;
 
 
 public Cuenta(int agencia, int numero) {
  if ( agencia <= 0 ) {
   System.out.println("No se permite 0");
   this.agencia = 1;
  } else {
   this.agencia = agencia;
  }
  this.numero = numero;
  this.total++;
  System.out.println("Se van creando: " + this.total + " cuentas");
 }
 
 public void depositar(double valor) {
  this.saldo = this.saldo + valor;
 }
 
 public boolean retirar(double valor) {
  if (this.saldo >= valor) {
   this.saldo = this.saldo - valor;
   return true;
  } else {
   return false;
  }
 }
 
 public boolean saca(double valor) {
  if ( this.saldo >= valor) {
   this.saldo -= valor;
   return true;
  } else {
   return false;
  }
 }
 
 public boolean transferir(double valor, Cuenta cuentaDestino) {
  if (this.saldo >= valor) {
   this.saca(valor);
   cuentaDestino.depositar(valor);
   return true;
  }
  return false;
 }
 
 public double getSaldo() {
  return this.saldo;
 }
 
 public void setSaldo(double saldo) {
  this.saldo = saldo;
 }
 
 public int getAgencia() {
  return this.agencia;
 }
 
 public void setAgencia(int agencia) {
  if ( agencia > 0) {
   this.agencia = agencia;
  } else {
   System.out.println("No estan permitidos valores negativos");
  }
 }
 
 public int getNumero() {
  return this.numero;
 }
 
 public void setNumero(int numero) {
  if ( numero > 0) {
   this.numero = numero;
  } else {
   System.out.println("No estan permitidos valores negativos");
  }
 }
 
 public Cliente getTitular() {
  return titular;
 }
 
 public void setTitular(Cliente titular) {
  this.titular = titular;
 }
 
 public static int getTotal() {
  return total;
 }
 
 public static void setTotal(int total) {
  Cuenta.total = total;
 }
}