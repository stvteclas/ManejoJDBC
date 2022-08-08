package test;

import datos.PersonaDAO;
import domain.Persona;

import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personadao= new PersonaDAO();
        List<Persona> personas=personadao.seleccionar();
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });

        Persona personaNueva= new Persona("Carlos", "Esparza","cesparza@mail.com", "554456587");
        personadao.insertar(personaNueva);
        personas = personadao.seleccionar();
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });

        Persona personaNew= new Persona(5,"Romina", "Balquinta","ro_balquuinta@gmail.com", "554456587");
        personadao.actualizar(personaNew);
        personas = personadao.seleccionar();
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });


        Persona personaEliminar= new Persona(5);
        personadao.eliminar(personaEliminar);
        personas = personadao.seleccionar();
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });




    }

    
}
