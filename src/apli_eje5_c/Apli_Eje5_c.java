/*Un obrero necesita calcular su salario semanal, el cual se obtiene:
Si trabaja 40 horas o menos se le paga $16000 por hora,
Si trabaja más de 40 horas se le paga $16000 por c/una de las primeras 40 horas 
y $20000 por c/hora extra. sT: salario Total. hT: horas Trabajadas.*/
package apli_eje5_c;

import javax.swing.JOptionPane;

public class Apli_Eje5_c {

    public static void main(String[] args) {
        //Declaración de variables
        int hT;
        float sT;
        hT = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de horas trabajadas en la semana:"));
        
        if (hT <= 40){
            sT = hT*16000;
        } 
        else {
            sT = (40*16000) + (hT-40)*20000;
             }
        JOptionPane.showMessageDialog (null, "El salario total de la semana trabajada es:" +sT);
        }
    }
    

