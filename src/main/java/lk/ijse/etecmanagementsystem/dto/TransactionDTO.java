package lk.ijse.etecmanagementsystem.dto;

public class TransactionDTO {

    private String transactionId;
    private String transactionDate;
    private String transactionType;  // 'SALE_PAYMENT', 'REPAIR_PAYMENT', 'SUPPLIER_PAYMENT', 'REFUND', 'EXPENSE'
    private String paymentMethod;  // 'CASH', 'CARD', 'TRANSFER'
    private double amount;
    private String flow;  // ENUM ('IN', 'OUT')  'IN' for Income, 'OUT' for Expenses/Refunds
    private int saleId;
    private int repairId;
    private int customerId;
    private int userId;
    private String referenceNote;
    private  String userName;

    public TransactionDTO(String transactionId, String transactionDate, String transactionType, String paymentMethod, double amount, String flow, int saleId, int repairId, int customerId, int userId, String referenceNote, String userName) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.flow = flow;
        this.saleId = saleId;
        this.repairId = repairId;
        this.customerId = customerId;
        this.userId = userId;
        this.referenceNote = referenceNote;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getFlow() {
        return flow;
    }

    public void setFlow(String flow) {
        this.flow = flow;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public int getRepairId() {
        return repairId;
    }

    public void setRepairId(int repairId) {
        this.repairId = repairId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getReferenceNote() {
        return referenceNote;
    }

    public void setReferenceNote(String referenceNote) {
        this.referenceNote = referenceNote;
    }

    @Override
    public String toString() {
        return "TransactionDTO{" +
                "transactionId='" + transactionId + '\'' +
                ", transactionDate='" + transactionDate + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", amount=" + amount +
                ", flow=" + flow +
                ", saleId=" + saleId +
                ", repairId=" + repairId +
                ", customerId=" + customerId +
                ", userId=" + userId +
                ", referenceNote='" + referenceNote + '\'' +
                '}';
    }
}
