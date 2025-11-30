package lessons.lesson_02.app.code;

import lessons.lesson_02.app.staff.administration.Director;
import lessons.lesson_02.app.staff.administration.ProductChief;
import lessons.lesson_02.app.staff.administration.SalesChief;
import lessons.lesson_02.app.staff.specialists.Secretary;
import lessons.lesson_02.app.staff.specialists.productions.MachineOperator;
import lessons.lesson_02.app.staff.specialists.productions.StoreKeeper;
import lessons.lesson_02.app.staff.specialists.sales.Merchandiser;
import lessons.lesson_02.app.staff.specialists.sales.SalesManager;

public class Application {
    public static void main(String[] args){

        // Production Department
        MachineOperator machineOperator = new MachineOperator();
        StoreKeeper storeKeeper = new StoreKeeper();

        // Sales Department
        Merchandiser merchandiser = new Merchandiser();
        SalesManager salesManager = new SalesManager();

        Secretary secretary = new Secretary();

        ProductChief productChief = new ProductChief();
        productChief.setMachineOperator(machineOperator);
        productChief.setStoreKeeper(storeKeeper);

        SalesChief salesChief = new SalesChief();
        salesChief.setMerchandiser(merchandiser);
        salesChief.setSalesManager(salesManager);

        Director director = new Director();
        director.setSecretary(secretary);
        director.setProductChief(productChief);
        director.setSalesChief(salesChief);

        director.manageCompany();


    }
}
