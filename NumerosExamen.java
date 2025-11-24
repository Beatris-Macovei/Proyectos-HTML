public    numbers()
{
   Scanner sc=new Scanner(System.in);
   
   do
   {
       int numero,positivos,negativos, contadorPositivos,contadoNegativos=0;
      System.out.println("dame un numero");
      numero=sc.next.int;
      if(nuemro>0)
      {
        positivo=positivo+nuemro;
        contadorPositivo++;
      }
      if(nuemro<0)
      {
          negostivos=negativos+nuemro;
          contadorNegativos++;
      }
      }
      
    }
    while(numero!=0);
    system.out.printl("totalpositivo="+contadorPositivos);
    system.out.printl("total negativos="+contadorNegativos);
   if(contadorPositivo>0)
   ssystem.out("media="+ positivos/contadorPositivos);
   if(contadorNegativos>0)
   System.out.print("media ="+ negativos/contadorNegativos);
