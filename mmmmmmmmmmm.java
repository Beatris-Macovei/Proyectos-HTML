public class TestAutobus
{
  public static void main(String[]args)
  {
    Autobus inter = new Autobus();
    
    Persona paco = new Persona("Paco", "7645028B");
    Persona pepe = new Persona("Pepe", "7623028B");
    Persona ana = new Persona("Ana", "7621928B");
    Persona diana = new Persona("Diana", "9811928B");
    
    inter.subir(paco);
    inter.personaAsiento();
    
    for(int i=bus.length; i<5; i++)
    {
     inter.subir(new Persona("Anonimo"+i, "00000"+i))
    }
    
    inter.personaAsiento();
    inter.bajar(4);
    
    
     System.out.println("Estas son las plazas ocupadas"+inter.plazasOcupadas());
    
     System.out.println("Estas son las plazas libres"inter.plazasLibres());
     
    Persona asiento = bus.personaAsiento();
        if(asiento != null){
            System.out.println("En esa plaza está: " + asiento.getNombre());
        } else {
            System.out.println("La plaza está libre o no existe.");
        }
     
    
     System.out.println("Esta plaza se ha ocupado"+inter.subirPersona(paco));
    
    inter.bajarPersona();
     System.out.println("mdnd");
     
    System.out.println("Estas son las plazas ocupadas"+inter.plazasOcupadas());
    
  }
}
