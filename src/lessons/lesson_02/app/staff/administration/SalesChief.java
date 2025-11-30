package lessons.lesson_02.app.staff.administration;

import lessons.lesson_02.app.staff.specialists.sales.Merchandiser;
import lessons.lesson_02.app.staff.specialists.sales.SalesManager;

public class SalesChief {
    private Merchandiser merchandiser;
    private SalesManager salesManager;

    public void giveOrders() {
        merchandiser.work();
        salesManager.work();
    }

    public void setMerchandiser(Merchandiser merchandiser) {
        this.merchandiser = merchandiser;
    }

    public void setSalesManager(SalesManager salesManager) {
        this.salesManager = salesManager;
    }

    public Merchandiser getMerchandiser() {
        return merchandiser;
    }

    public SalesManager getSalesManager() {
        return salesManager;
    }
}
