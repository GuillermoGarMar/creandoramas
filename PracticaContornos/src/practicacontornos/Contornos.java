
package practicacontornos;


public class Contornos {
    private int num1;
    private int num2;
    
    public Contornos(){
        
    }
    public Contornos (int num1, int num2){
        this.num1=num1;
        this.num2=num2;
}
    public void comparar(int n1, int n2){
        if(n1>n2)
            System.out.println(n1 + "es mayor");
           System.out.println("adios");
    }
    public void compararDoble(int n1, int n2){
        if (n1>n2){
            System.out.println(n1+"es mayor");
        }
        else
            System.out.println(n2+"es mayor");
           System.out.println("adios"); 
        }
    public void compararAnidado(int n1, int n2){
        if (n1>n2)
            System.out.println(n1+"es mayor");
        else if(n1==n2)
            System.out.println("son iguales");
        else
            System.out.println(n2+"es mayor");
            System.out.println("adios");
            
    }
    public void compararOperador(int n1, int n2){
        int mayor = (n1>n2)? n1:n2;
        System.out.println("el mayor es"+mayor);
    }
    }
    

