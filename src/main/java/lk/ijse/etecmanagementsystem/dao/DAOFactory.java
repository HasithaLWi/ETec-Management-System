package lk.ijse.etecmanagementsystem.dao;


import lk.ijse.etecmanagementsystem.dao.custom.impl.*;

public class DAOFactory {
    private static DAOFactory instance;

    private DAOFactory() {}

    public static DAOFactory getInstance() {
        if (instance == null) {
            instance = new DAOFactory();
        }
        return instance;
    }

    public enum DAOTypes {
        CATEGORY, CUSTOMER, PRODUCT, PRODUCT_ITEM, QUERY, REPAIR_JOB, REPAIR_ITEM, REPAIR_SALE,
        SALES, SALES_ITEM, SUPPLIER, TRANSACTION_RECORD, USER
    }

    public SuperDAO getDAO(DAOFactory.DAOTypes daoTypes) {
        switch (daoTypes) {
            case CATEGORY:
                return new CategoryDAOImpl();
            case CUSTOMER:
                return new CustomerDAOImpl();
            case PRODUCT:
                return new ProductDAOImpl();
            case PRODUCT_ITEM:
                return  new ProductItemDAOImpl();
            case QUERY:
                return new QueryDAOImpl();
            case REPAIR_JOB:
                return new RepairJobDAOImpl();
            case REPAIR_ITEM:
                return new RepairItemDAOImpl();
            case REPAIR_SALE:
                return new RepairSalesDAOImpl();
            case SALES:
                return new SalesDAOImpl();
            case SALES_ITEM:
                return new SalesItemDAOImpl();
            case SUPPLIER:
                return new SupplierDAOImpl();
            case TRANSACTION_RECORD:
                return new TransactionRecordDAOImpl();
            case USER:
                return new UserDAOImpl();
            default:
                return null;
        }
    }
}
