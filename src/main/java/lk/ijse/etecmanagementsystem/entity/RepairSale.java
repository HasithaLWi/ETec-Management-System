package lk.ijse.etecmanagementsystem.entity;

public class RepairSale {
    private int repair_sale_id;
    private int repair_id;
    private int sale_id;

    public RepairSale() {
    }

    public RepairSale(int repair_sale_id, int repair_id, int sale_id) {
        this.repair_sale_id = repair_sale_id;
        this.repair_id = repair_id;
        this.sale_id = sale_id;
    }

    public int getRepair_sale_id() {
        return repair_sale_id;
    }

    public void setRepair_sale_id(int repair_sale_id) {
        this.repair_sale_id = repair_sale_id;
    }

    public int getRepair_id() {
        return repair_id;
    }

    public void setRepair_id(int repair_id) {
        this.repair_id = repair_id;
    }

    public int getSale_id() {
        return sale_id;
    }

    public void setSale_id(int sale_id) {
        this.sale_id = sale_id;
    }

    @Override
    public String toString() {
        return "RepairSale{" +
                "repair_sale_id=" + repair_sale_id +
                ", repair_id=" + repair_id +
                ", sale_id=" + sale_id +
                '}';
    }
}
