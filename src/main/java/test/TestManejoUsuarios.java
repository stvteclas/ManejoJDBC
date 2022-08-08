package test;

import datos.PersonaDAO;
import datos.usuarioDAO;

import domain.Usuario;

import java.util.List;

public class TestManejoUsuarios {
        public static void main(String[] args) {
            usuarioDAO usuarioDAO= new usuarioDAO();
            List<Usuario> usuarios=usuarioDAO.seleccionar();
            usuarios.forEach(usuario -> {
                System.out.println("usuario = " + usuario);
            });


            Usuario usuario1= new Usuario("Romina","mexico22");
            usuarioDAO.insertar(usuario1);
            usuarios = usuarioDAO.seleccionar();
            usuarios.forEach(usuario -> {
                System.out.println("usuario = " + usuario);
            });

            Usuario usuario3= new Usuario("Pablo","tokio22");
            usuarioDAO.insertar(usuario3);
            usuarios = usuarioDAO.seleccionar();
            usuarios.forEach(usuario -> {
                System.out.println("usuario = " + usuario);
            });

            Usuario usuario2= new Usuario(1,"Sofia","francia22");
            usuarioDAO.actualizar(usuario2);
            usuarios = usuarioDAO.seleccionar();
            usuarios.forEach(usuario -> {
                System.out.println("usuario = " + usuario);
            });

            Usuario usuarioEliminar= new Usuario(2);
            usuarioDAO.eliminar(usuarioEliminar);
            usuarios = usuarioDAO.seleccionar();
            usuarios.forEach(usuario -> {
                System.out.println("usuario = " + usuario);
            });

        }
    }
