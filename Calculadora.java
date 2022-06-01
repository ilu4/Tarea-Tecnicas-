
package ejemploswitch;
import javax.swing.*;

public class Ejemploswitch {

    
    public static void main(String[] args) {
    double numero1, numero2, suma, resta, multiplicacion, division, promedio;
    int operaciones;
    
    
    operaciones = Integer.parseInt(JOptionPane.showInputDialog(null,"menu"+"\n"+"Digite la opcion deseada"+"\n"+"1.Suma"+"\n"+"2.Resta"+"\n"+"3.Multiplicacion"+"\n"+"4.Division"
            + "\n"+"5.Promedio"+ "\n" + "6. Verificacion de numero primo" + "\n" + "7.Verificar si el numero es palindromo"));
    
    numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite un numero"));
    
    numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite otro numero"));
    
    
    
    switch(operaciones) {
        case 1:
            suma = numero1 + numero2;
            JOptionPane.showMessageDialog(null, "La Suma es " + suma);
        break;
        case 2:
            resta = numero1 - numero2;
            JOptionPane.showMessageDialog(null, "La Resta es " + resta);
        break;
        case 3:
            multiplicacion = numero1 * numero2;
            JOptionPane.showMessageDialog(null, "La Multiplicacion es " + multiplicacion);
        break;
        case 4:
            division = numero1 / numero2;
            JOptionPane.showMessageDialog(null, "La Division es " + division);
        break;
        case 5:
            promedio = (numero1 + numero2)/2;
            JOptionPane.showMessageDialog(null, "El Promedio es " + promedio);
        break;
        case 6:
            if (numero1 == 0 || numero1 == 1 || numero1 ==4){
                JOptionPane.showMessageDialog(null, "El Numero no es primo");
                
            }else{
                for (int i = 2; i < numero1 /2; i++) {
                   if(numero1 %i==0){
                       JOptionPane.showMessageDialog(null, "El Numero no primo");
                   }else{
                       JOptionPane.showMessageDialog(null, "El Numero e primo");
                   }
                }
            }
        break;
        case 7:
            numero1=numero1.nextInt();
		
		faltante=numero;
		numeroInvertido=0;
		restante=0;
		
		while(faltante!=0) {
       
	    restante=faltante%10;
        numeroInvertido=numeroInvertido*10+restante;
        faltante=faltante/10;
		
		}
		
	    if(numeroInvertido==numero){
			
        System.out.println("\n El numero es capicua\n");
        
		}else{
       
        System.out.println("\n El numero no es capicua\n");
		
		}
		
		}
        
       
        
        default:
            JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
    }
    }
    
}
















































