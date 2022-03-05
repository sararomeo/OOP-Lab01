class Student {

	// ... Aggiungere qui la definizione dei campi

	private String name, surname;
	private int id, matriculationYear;

	void build(/* Aggiungere i parametri di input */String name, String surname, int id, int matriculationYear) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.matriculationYear = matriculationYear;
    }

	void printStudentInfo() {
		/*
		 * Aggiungere i comandi per la stampa delle informazioni sullo studente
		 */
		System.out.println(name + " - " + surname + " - " + id + " - " + matriculationYear);
	}
}
