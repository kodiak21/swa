package model;

abstract class Visitor {

	abstract void visit(PayPalPayment payPalPayment);
	abstract void visit(MoneyWalletPayment moneyWalletPayment);
	abstract void visit(GoogleWalletPayment googleWalletPayment);
}
