/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.utilitarios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eu
 */
public class MedidasServ {
    
    private List<Medidas> lsMedidas;
    
    public MedidasServ(){
        lsMedidas = new ArrayList<>();
        lsMedidas.add(new Medidas("UN", "Unidade"));
        lsMedidas.add(new Medidas("KG", "Quilo"));
        lsMedidas.add(new Medidas("MG", "Miligrama"));
        lsMedidas.add(new Medidas("LA", "Lata"));
        lsMedidas.add(new Medidas("LI", "Litro"));
        lsMedidas.add(new Medidas("ML", "Mililitro"));
        lsMedidas.add(new Medidas("M2", "Metro Quadrado"));
        lsMedidas.add(new Medidas("M3", "Metro Cúbico"));
        lsMedidas.add(new Medidas("BD", "Balde"));
    }

    public List<Medidas> getLsMedidas() {
        return lsMedidas;
    }
    
    
}
