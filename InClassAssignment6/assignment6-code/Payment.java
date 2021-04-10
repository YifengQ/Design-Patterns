

public interface Payment {
	public String toString();
}

class BillsPayment implements Payment {
	public String toString() {
		return "Bills payment";
	}
}

class CoinPayment implements Payment {
	public String toString() {
		return "Coin payment";
	}
}

class TicketInTicketOut implements Payment {
	public String toString() {
		return "Ticket in ticket out payment";
	}
}