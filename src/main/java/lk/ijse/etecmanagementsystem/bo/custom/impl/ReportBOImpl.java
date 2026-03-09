package lk.ijse.etecmanagementsystem.bo.custom.impl;

import lk.ijse.etecmanagementsystem.bo.custom.ReportBO;
import lk.ijse.etecmanagementsystem.dao.DAOFactory;
import lk.ijse.etecmanagementsystem.dao.custom.*;
import lk.ijse.etecmanagementsystem.dao.custom.impl.*;

import java.sql.SQLException;
import java.time.LocalDate;

public class ReportBOImpl implements ReportBO {
    CustomerDAO customerDAO = (CustomerDAOImpl) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);
    RepairJobDAO repairJobDAO = (RepairJobDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.REPAIR_JOB);
    SupplierDAO supplierDAO = (SupplierDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUPPLIER);
    SalesDAO salesDAO = (SalesDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SALES);
    TransactionRecordDAO transactionRecordDAO = (TransactionRecordDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.TRANSACTION_RECORD);
    ProductDAO productDAO = (ProductDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PRODUCT);

    @Override
    public int getSalesCount(LocalDate from, LocalDate to) throws SQLException {
        return salesDAO.getSalesCount(from, to);
    }

    @Override
    public boolean isSaleExist(String saleId) throws SQLException {
        return salesDAO.isSaleExist(saleId);
    }

    @Override
    public int getRepairCount(LocalDate from, LocalDate to) throws SQLException {
        return repairJobDAO.getRepairCount(from, to);
    }

    @Override
    public boolean isRepairExist(String repairId) throws SQLException {
        return repairJobDAO.isRepairExist(repairId);
    }

    @Override
    public int getTransactionCount(LocalDate from, LocalDate to) throws SQLException {
        return transactionRecordDAO.getTransactionCount(from, to);
    }

    @Override
    public int getInventoryCount() throws SQLException {
        return productDAO.getInventoryCount();
    }

    @Override
    public int getSupplierCount() throws SQLException {
        return supplierDAO.getSupplierCount();
    }

    @Override
    public int getCustomerCount() throws SQLException {
        return customerDAO.getCustomerCount();
    }
}
