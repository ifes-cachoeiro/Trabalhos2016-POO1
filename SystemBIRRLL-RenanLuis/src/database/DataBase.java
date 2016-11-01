/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import domain.Admin;
import domain.Cliente;
import domain.Especialidade;
import domain.Professor;
import domain.Tipo_turma;
import domain.Turma;
import java.util.ArrayList;

/**
 *
 * @author Lamon's House
 */
public class DataBase {
    public static ArrayList<Professor> lstProfessor = new ArrayList<>();
    public static ArrayList<Cliente> lstCliente = new ArrayList<>();
    public static ArrayList<Especialidade> lstEspecialidade= new ArrayList<>();
    public static ArrayList<Turma> lstTurma = new ArrayList<>();
    public static ArrayList<Tipo_turma> lstTipoTurma = new ArrayList<>();
    public static ArrayList<Admin> lstAdmin = new ArrayList<>();
}
