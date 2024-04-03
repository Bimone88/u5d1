package simonemanca.u5d1.entities;

public class Tavolo {
    private int numero;
    private int maxCoperti;
    private StatoTavolo stato;

    public Tavolo(int numero, int maxCoperti, StatoTavolo stato) {
        this.numero = numero;
        this.maxCoperti = maxCoperti;
        this.stato = stato;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getMaxCoperti() {
        return maxCoperti;
    }

    public void setMaxCoperti(int maxCoperti) {
        this.maxCoperti = maxCoperti;
    }

    public StatoTavolo getStato() {
        return stato;
    }

    public void setStato(StatoTavolo stato) {
        this.stato = stato;
    }

    public enum StatoTavolo {
        OCCUPATO, LIBERO
    }
}

