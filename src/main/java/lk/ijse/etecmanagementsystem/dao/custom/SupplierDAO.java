package lk.ijse.etecmanagementsystem.dao.custom;

import lk.ijse.etecmanagementsystem.dao.CrudDAO;
import lk.ijse.etecmanagementsystem.dto.SupplierDTO;
import lk.ijse.etecmanagementsystem.entity.Supplier;

import java.sql.SQLException;
import java.util.List;

public interface SupplierDAO extends CrudDAO<Supplier> {

    List<Supplier> getSupplierByName(String name) throws SQLException;

    int getSupplierCount() throws SQLException;
}

