package simonemanca.u5d1.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Ordine {
    private String numeroOrdine;
    private StatoOrdine stato;
    private int numeroCoperti;
    private LocalDateTime oraAcquisizione;
    private List<MenuItem> elementi;
    private double importoTotale;

    public Ordine(String numeroOrdine, StatoOrdine stato, int numeroCoperti, LocalDateTime oraAcquisizione) {
        this.numeroOrdine = numeroOrdine;
        this.stato = stato;
        this.numeroCoperti = numeroCoperti;
        this.oraAcquisizione = oraAcquisizione;
        this.elementi = new ArrayList<>();
        this.importoTotale = 0.0;
    }

    public void aggiungiElemento(MenuItem elemento) {
        if (elemento != null) {
            this.elementi.add(elemento);
        }
    }

    public void calcolaImportoTotale(double costoCoperto) {
        double totale = elementi.stream().mapToDouble(MenuItem::getPrezzo).sum();
        this.importoTotale = totale + (costoCoperto * numeroCoperti);
    }

    // Getter e setter
    public String getNumeroOrdine() {
        return numeroOrdine;
    }

    public void setNumeroOrdine(String numeroOrdine) {
        this.numeroOrdine = numeroOrdine;
    }

    public StatoOrdine getStato() {
        return stato;
    }

    public void setStato(StatoOrdine stato) {
        this.stato = stato;
    }

    public int getNumeroCoperti() {
        return numeroCoperti;
    }

    public void setNumeroCoperti(int numeroCoperti) {
        this.numeroCoperti = numeroCoperti;
    }

    public LocalDateTime getOraAcquisizione() {
        return oraAcquisizione;
    }

    public void setOraAcquisizione(LocalDateTime oraAcquisizione) {
        this.oraAcquisizione = oraAcquisizione;
    }

    public List<MenuItem> getElementi() {
        return elementi;
    }

    public void setElementi(List<MenuItem> elementi) {
        this.elementi = elementi;
    }

    public double getImportoTotale() {
        return importoTotale;
    }

    // si potrebbe voler impedire la modifica diretta dell'importo totale
    // quindi non ffornirò al momento  un setter per importoTotale.

    public enum StatoOrdine {
        IN_CORSO, PRONTO, SERVITO
    }

    @Override
    public String toString() {
        // Qui si potrebbe implementare una rappresentazione stringa dell'ordine per il logging
        return "Ordine{" +
                "numeroOrdine='" + numeroOrdine + '\'' +
                ", stato=" + stato +
                ", numeroCoperti=" + numeroCoperti +
                ", oraAcquisizione=" + oraAcquisizione +
                ", elementi=" + elementi +
                ", importoTotale=" + importoTotale +
                '}';
    }
}

