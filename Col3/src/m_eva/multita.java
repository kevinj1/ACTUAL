/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m_eva;

import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class multita {
    public int a1;
    public int a2;

    public multita(int a1, int a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public int getA2() {
        return a2;
    }

    public void setA2(int a2) {
        this.a2 = a2;
    }
    public void calcular(){
        int alma;
         alma = a1+a2;
         JOptionPane.showMessageDialog(null, alma);
                 
                 
                
    }
}
