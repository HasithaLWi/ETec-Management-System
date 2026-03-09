package lk.ijse.etecmanagementsystem.bo.custom;

import lk.ijse.etecmanagementsystem.bo.SuperBO;
import lk.ijse.etecmanagementsystem.dto.TransactionDTO;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public interface TransactionBO extends SuperBO {

    boolean settlePayment(String type, int id, double amount, int userId, String newPaymentStatus) throws SQLException;

    List<TransactionDTO> getAllTransactions(Date dpFromDate, Date dpToDate) throws SQLException;

    boolean saveManualTransaction(String type, double amount, String method, String note, int userId) throws SQLException;

    double[] getDashboardStats(Date fromDate, Date toDate) throws SQLException;
}
