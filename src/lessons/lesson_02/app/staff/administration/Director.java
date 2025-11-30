package lessons.lesson_02.app.staff.administration;

import lessons.lesson_02.app.staff.specialists.Secretary;

public class Director {
    private ProductChief productChief;
    private SalesChief salesChief;
    private Secretary secretary;

    public void manageCompany(){
        secretary.work();
        productChief.giveOrders();
        salesChief.giveOrders();
    }

    public void setProductChief(ProductChief productChief) {
        this.productChief = productChief;
    }

    public void setSalesChief(SalesChief salesChief) {
        this.salesChief = salesChief;
    }

    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }

    public ProductChief getProductChief() {
        return productChief;
    }

    public SalesChief getSalesChief() {
        return salesChief;
    }

    public Secretary getSecretary() {
        return secretary;
    }
}
