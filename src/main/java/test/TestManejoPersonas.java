package test;

import datos.PersonaDAO;
import domain.Persona;

import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personadao= new PersonaDAO();
        List<Persona> personas=personadao.seleccionar();
        for(Persona persona:personas){
            System.out.println("persona = " + persona);
        }
    }
}
