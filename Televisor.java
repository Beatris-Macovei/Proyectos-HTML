public class Televisor
{
  private boolean estado;
  private int pulgadas;
  private String pantalla;
  private char eficienciaEnergetica;
  private int canal;
  
  public Televisor(int pulgadas, String pantalla, char eficienciaEnergetica)
  {
    this.estado=false;
    this.pulgadas=pulgadas;
    this.pantalla=pantalla;
    this.eficienciaEnergetica=eficienciaEnergetica;
    this.canal=1;
  }
  
  public void encendido()
  {
    estado = true;
  }
  public int cambiaCanal()
  {
    if(estado==true)
    {
      for(int i=0; i<100; i++)
      {
        canal++;
        System.out.println("Canal:"+canal);
          if(canal==34)
            {
              System.out.println("Estamos en el canal 34");
            }
          if(canal==100)
          {
            canal=0;
          }
      }
    }else
    {
      System.out.println(estado);
    }
    return canal;
  }
  
  public void apagado()
  {
    estado = false;
  }
  
  public char getEficienciaEnergetica()
  {
    return eficienciaEnergetica;
  }
  
  public void setEficienciaEnergetica(char eficienciaEnergetica)
  {
    this.eficienciaEnergetica=eficienciaEnergetica;
  }
  
  public int getCanal()
  {
    return canal;
  }
  public boolean getEstado()
  {
    return estado;
  }
}
  
  
  
  
