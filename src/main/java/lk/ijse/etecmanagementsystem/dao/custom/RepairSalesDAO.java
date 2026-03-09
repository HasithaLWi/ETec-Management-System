package lk.ijse.etecmanagementsystem.dao.custom;

import lk.ijse.etecmanagementsystem.dao.CrudDAO;
import lk.ijse.etecmanagementsystem.entity.RepairSale;

public interface RepairSalesDAO extends CrudDAO<RepairSale> {

    boolean saveRepairSale(int repairId, int saleId) throws Exception;
}

