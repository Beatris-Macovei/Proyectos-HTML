public class TestPersona
{
  public static void main(String[] args)
  {
    Persona usuario = new Persona();
    CuentaBancaria cuenta1 = new CuentaBancaria();
    CuentaBancaria cuenta2 = new CuentaBancaria();
    CuentaBancaria cuenta3 = new CuentaBancaria();
    
    //AUTORIZADOS?
    
    
    //RELLENAR TITULAR (NO FUNCIONA SCANNER)
    String nombre = usuario.getNombre();
    System.out.println("Nombre usuario:"+" "+usuario.getNombre());
    
    String apellidos = usuario.getApellidos();
    System.out.println("Apellido usuario:"+" "+usuario.getApellidos());
    
    usuario.setTelefono(654567865);
    System.out.println("Telefono usuario:"+" "+usuario.getTelefono());
    
    String direccion = usuario.getDireccion();
    System.out.println("Direccion usuario:"+" "+usuario.getDireccion());
    
    int añoNacimiento = usuario.getAñoNacimiento();
    System.out.println("Año de nacimiento del usuario:"+" "+usuario.getAñoNacimiento());

    //FUNCIONA :)
    double ing = cuenta1.ingresoCuenta();
     System.out.println("Este es el dinero que desea ingresar:"+ing);
    boolean ret = cuenta1.retiroCuenta();
     System.out.println("¿Ha podido sacar dinero?"+" "+ret);
     
    cuenta1.getSaldo();
     System.out.println("Este es el saldo de la cuenta 2:"+cuenta1.getSaldo());
    
  }
}
