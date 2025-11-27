public class TestTelevisor
{
  public static void main(String[]args)
  {
    Televisor tele = new Televisor(64, "plasma", 'B');
    
    tele.encendido();
    System.out.println("El televisor esta encendido?:" +tele.getEstado());
    
    tele.cambiaCanal();
    
    System.out.println("Este es el estado:" +tele.getEstado());
    
    System.out.println("Estamos en este canal:"+tele.getCanal());
    
    tele.apagado();
    System.out.println("Televisor encendido?:"+tele.getEstado());
  }
}
  

