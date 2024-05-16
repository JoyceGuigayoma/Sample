/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hierarchicalinheritance;

/**
 *
 * @author User
 */
public class HierarchicalInheritance {

    public static void main(String[] args) {
       
        B b = new B();
        C c = new C();
        D d = new D();
        
        b.Show();
        b.ShowB();
        
        c.Show();
        c.ShowC();
        
        d.Show();
        d.ShowD();
        
        
    }
}
