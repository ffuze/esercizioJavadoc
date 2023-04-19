/**
 * La classe rappresenta e gestisce dati di tipo temporale
 */
public class Time{

    /**
     * Numero di minuti dell'oggetto Time
     */
    protected int minuti;
    
    /**
     * Numero di ore dell'oggetto Time
     */
    protected int ore;
    
    /**
     * Numero di secondi dell'oggetto Time
     */
    protected int secondi;
    
    /**
     * Costruisce un oggetto Time dato in ingresso ore, minuti e secondi.
     */
    public Time(int minuti, int ore, int secondi) {
        this.minuti = minuti;
        this.ore = ore;
        this.secondi = secondi;
        if(this.isCorrect()==false){
            minuti=0;
            ore=0;
            secondi=0;
        }
    }

    /**
     * Costruisce un oggetto Time dato in ingresso il numero di secondi.
     */
    public Time(int secondi) {
        ore = secondi / 3600;
        minuti = (secondi % 3600) / 60;
        this.secondi = (secondi % 3600) % 60;
    }

    /**
     * Un metodo secondario utilizzato per controllare i numeri delle ore, minuti e secondi.
     */
    public boolean isCorrect(){
        if(minuti>60 || ore>24 || secondi>60)
            return false;
        return true;
    }

    /**
     * Esprime le ore, i minuti e i secondi dell'oggetto Time in secondi.
     */
    public int convertiSecondi(){
        return ore*3600 + minuti*60 + secondi;
    }

    /**
     * Vengono addizionati il numero di secondi specificati.
     */
    public void addSecondi(int secondi){
        int totaleSecondi = convertiSecondi() + secondi;
        if (totaleSecondi >= 0) {
            ore = totaleSecondi / 3600;
            minuti = (totaleSecondi % 3600) / 60;
            this.secondi = (totaleSecondi % 3600) % 60;
        }
    }

    /**
     * Restituisce una stringa che rappresenta l'oggetto
     */
    public String toString() {
        String s="";
        s+="Ore: " + ore + "\nMinuti: " + minuti + "\nSecondi: " + secondi + "\n";
        return s;
    }

    /**
     * Restituisce il numero di minuti
     */
    public int getMinuti() {
        return minuti;
    }

    /**
     * Restituisce il numero delle ore
     */
    public int getOre() {
        return ore;
    }

    /**
     * Restituisce il numero dei secondi
     */
    public int getSecondi() {
        return secondi;
    }

    @Deprecated
    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    @Deprecated
    public void setOre(int ore) {
        this.ore = ore;
    }

    @Deprecated
    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }

}