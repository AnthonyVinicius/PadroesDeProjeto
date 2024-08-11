package br.com.ifpe.main;

import java.util.Scanner;

import br.com.ifpe.presentation.ClientGUI;
import br.com.ifpe.presentation.EmployeeGUI;
import br.com.ifpe.utils.EntitieLoad;

public class Main {
    public static void main(String[] args) {

        EntitieLoad load = new EntitieLoad();
        load.loadEntities();

        EmployeeGUI Employee = new EmployeeGUI();
        ClientGUI Client = new ClientGUI();
        Scanner scanner = new Scanner(System.in);
        boolean system = true;
        while (system) {
            try {
                System.out.println("[1]-Client\n[2]-Employee\n[3]-Exit");
                String option = scanner.nextLine();

                switch (option) {
                    case "1":
                        Client.gui();
                        break;
                    case "2":
                        Employee.gui();
                    case "3":
                        system = false;
                }

            } catch (Exception e) {
                System.out.println("Invalid Code: " + e.getMessage());
            }
        }

    }
}



