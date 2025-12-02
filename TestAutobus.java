public class TestAutobus
{
  public static void main(String[]args)
  {
    Autobus inter = new Autobus();
    
    inter.plazasOcupadas();
     System.out.println("Estas son las plazas ocupadas");
    
    inter.plazasLibres();
     System.out.println("Estas son las plazas libres");
     
    inter.personaAsiento();
     System.out.println("Esta es la plaza que has icho");
     
    inter.subirPersona();
     System.out.println("Esta plaza se ha ocupado");
    
    inter.bajarPersona();
     System.out.println("mdnd");
    
  }
}
