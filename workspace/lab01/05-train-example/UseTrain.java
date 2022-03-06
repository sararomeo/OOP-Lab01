class UseTrain {
    public static void main(String[] args) {
        /*
         * Premesse per un corretto testing della classe. Per ragioni di
         * coerenza e semplicità:
         * - I vari metodi siano sempre invocati passando dei parametri di input
         * validi e consistenti (p.e. non invocare i metodi per effettuare delle
         * prenotazioni specificando un numero di posti superiore alla capienza
         * del treno, ai posti disponibili per la classe (prima/seconda)
         * considerata, al numero di posti correntemente liberi
         *
         *
         * Testing: 1) Creare un oggetto della classe Train specificando valori
         * a piacere per i parametri*/
    	
    	Train train = new Train();
    	train.build(50, 80);
    	
        /* 2) Effettuare delle prenotazioni in prima e seconda classe
         * specificando un numero di posti da prenotare consistente */
        
    	train.reserveFirstClassSeats(20);
    	train.reserveSecondClassSeats(40);
    	
        /* 3) A seguito di ciascuna prenotazione stampare la ratio di
         * occupazione totale e per ciascuna classe. */
    	
    	System.out.println(train.getFirstClassOccupancyRatio());
    	System.out.println(train.getSecondClassOccupancyRatio());
        
        /* 4) Cancellare tutte le prenotazioni */
		train.deleteAllReservations();
        
        /* 5) Prenotare nuovamente dei posti e stampare le nuove percentuali di occupazione */
        train.reserveFirstClassSeats(25);
     	train.reserveSecondClassSeats(70);
     	System.out.println(train.getFirstClassOccupancyRatio());
    	System.out.println(train.getSecondClassOccupancyRatio());
    }
}
