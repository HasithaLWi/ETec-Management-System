package lk.ijse.etecmanagementsystem.dao.custom.impl;

import lk.ijse.etecmanagementsystem.dao.custom.SalesItemDAO;
import lk.ijse.etecmanagementsystem.entity.SalesItem;
import lk.ijse.etecmanagementsystem.dao.CrudUtil;

import java.sql.SQLException;
import java.util.List;

public class SalesItemDAOImpl implements SalesItemDAO {

    @Override
    public List<SalesItem> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public boolean save(SalesItem entity) throws SQLException {
        String sqlSalesItem = "INSERT INTO SalesItem (sale_id, item_id, customer_warranty_months, unit_price, discount) VALUES (?, ?, ?, ?, ?)";
        return CrudUtil.execute(sqlSalesItem,
                entity.getSale_id(),
                entity.getItem_id(),
                entity.getCustomer_warranty_months(),
                entity.getUnit_price(),
                entity.getDiscount()
        );
    }

    @Override
    public boolean update(SalesItem entity) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }

    @Override
    public SalesItem search(int id) throws SQLException {
        return null;
    }
}
