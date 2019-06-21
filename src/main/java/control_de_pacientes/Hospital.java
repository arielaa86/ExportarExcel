/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_de_pacientes;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class Hospital implements Serializable{
    
    
    private ArrayList<Paciente> pacientes;

    public Hospital() {
        
       pacientes = new ArrayList<>();
        
    }
    
    
    
    public boolean addPaciente(Paciente paciente_nuevo){

        for (Paciente paciente : pacientes) {
            if(paciente.getIdentifcacion().equals(paciente_nuevo.getIdentifcacion())){
                return false;
            }
        }

        pacientes.add(paciente_nuevo);
        
        return true;
        
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }
    
    
    
    
    
    
    
    
    
    
}
