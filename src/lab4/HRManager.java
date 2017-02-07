/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author CPere
 */
public class HRManager {
     private Employee employee;
     
    private boolean doneEmployeeOrientation;
    private EmployeeReportService reportService;

    public HRManager(String empFirstName, String empLastName, String empSsn) {
        employee = new Employee(empFirstName, empLastName, empSsn);
        reportService = new EmployeeReportService();
    }

    public void doEmployeeOrientation(String cubeId) {
        employee.doFirstTimeOrientation(cubeId);
        employee.getReportService().outputReport();
        setDoneEmployeeOrientation(true);
    }

    public void hireEmployee(String empCubeId) {
        doEmployeeOrientation(empCubeId);
        if (doneEmployeeOrientation = true) {
            generateWelcomNote();
        }
    }

    public void generateWelcomNote() {
        reportService.addData("Welcome " + employee.getFirstName() + ", to " + Company.getName() + "!");
        reportService.outputReport();
    }

    public boolean isDoneEmployeeOrientation() {
        return doneEmployeeOrientation;
    }

    public void setDoneEmployeeOrientation(boolean doneEmployeeOrientation) {
        this.doneEmployeeOrientation = doneEmployeeOrientation;
    }

    public EmployeeReportService getReportService() {
        return reportService;
    }

    public void setReportService(EmployeeReportService reportService) {
        this.reportService = reportService;
    }
}
