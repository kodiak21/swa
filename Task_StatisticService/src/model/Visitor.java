package model;

abstract class Visitor {

	abstract void visit(PayPalPayment eb);
	abstract void visit(MoneyWalletPayment gb);
	abstract void visit(GoogleWalletPayment gb);
}
