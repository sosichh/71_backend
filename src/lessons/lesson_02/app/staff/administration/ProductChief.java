package lessons.lesson_02.app.staff.administration;

import lessons.lesson_02.app.staff.specialists.productions.MachineOperator;
import lessons.lesson_02.app.staff.specialists.productions.StoreKeeper;

public class ProductChief {
    private MachineOperator machineOperator;
    private StoreKeeper storeKeeper;

    public void giveOrders() {
        machineOperator.work();
        storeKeeper.work();
    }

    public void setMachineOperator(MachineOperator machineOperator) {
        this.machineOperator = machineOperator;
    }

    public void setStoreKeeper(StoreKeeper storeKepper) {
        this.storeKeeper = storeKepper;
    }

    public MachineOperator getMachineOperator() {
        return machineOperator;
    }

    public StoreKeeper getStoreKeeper() {
        return storeKeeper;
    }
}
