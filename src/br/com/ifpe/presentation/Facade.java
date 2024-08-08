package br.com.ifpe.presentation;

import java.util.List;
import br.com.ifpe.controller.EmployeeController;
import br.com.ifpe.controller.ClientController;
import br.com.ifpe.entities.abstractclass.CpuAbstract;

public class Facade {
    private final EmployeeController employeeController = EmployeeController.getInstance();
    private final ClientController clientController = ClientController.getInstance();

    public void employeeRegister(CpuAbstract cpu) {employeeController.register(cpu);}

    public CpuAbstract employeeRead(String model) {return employeeController.read(model);}

    public void employeeDelete(String model) {employeeController.delete(model);}

    public void employeeUpdate(String oldModel, CpuAbstract updatedCpu){
        employeeController.update(oldModel, updatedCpu);
    }

    public List<CpuAbstract> employeeViewAll() {return employeeController.viewAll();}

    public void clientAdd(CpuAbstract cpu) {clientController.add(cpu);}

    public void clientDelete(String model){clientController.delete(model);}

    public void clientTotal(){clientController.getTotalValue();}

    public List<CpuAbstract> clientViewAll() {return clientController.viewAll();}

}
