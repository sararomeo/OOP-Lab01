
public class Train {
	private int nTotSeats, nFirstClassSeats, nSecondClassSeats;
	private int nFirstClassReservedSeats, nSecondClassReservedSeats;
	
	void build (int nFirstClassSeats, int nSecondClassSeats) {
		this.nTotSeats=nFirstClassSeats+nSecondClassSeats;
		this.nFirstClassSeats=nFirstClassSeats;
		this.nSecondClassSeats=nSecondClassSeats;
		this.nFirstClassReservedSeats=0;
		this.nSecondClassReservedSeats=0;
	}
	
	void reserveFirstClassSeats(int nFirstClassReservedSeats) /* consente di riservare dei posti in prima classe */ {
		this.nFirstClassReservedSeats=nFirstClassReservedSeats;
	}
	
	void reserveSecondClassSeats(int nSecondClassReservedSeats) /* consente di riservare dei posti in seconda classe */ {
		this.nSecondClassReservedSeats=nSecondClassReservedSeats;
	}
	
	double getTotOccupancyRatio() /* percentuale globale di posti occupati */ {
		int totReservedSeats;
		totReservedSeats=this.nFirstClassReservedSeats+this.nSecondClassReservedSeats;
		return ((totReservedSeats*100)/this.nTotSeats);
	}
	
	double getFirstClassOccupancyRatio() /* percentuale posti occupati in prima classe */ {
		return ((this.nFirstClassReservedSeats*100)/this.nFirstClassSeats);
	}
	
	double getSecondClassOccupancyRatio() /* percentuale posti occupati in seconda classe */ {
		return ((this.nSecondClassReservedSeats*100)/this.nSecondClassSeats);
	}
	
	void deleteAllReservations() /* annulla tutte le prenotazioni */ {
		this.nFirstClassReservedSeats=0;
		this.nSecondClassReservedSeats=0;
	}
	
	/* Nota: Si gestisca correttamente la conversione da int a double all'atto del
	 * calcolo della percentuale di posti occupati. Si fa presente che le operazioni fra tipi
	 * primitivi in Java funzionano allo stesso modo delle operazioni fra int e double in C
	 * (compilato per processori a 64bit) -	chiedere al docente o al tutor in caso di dubbi.*/	
}
