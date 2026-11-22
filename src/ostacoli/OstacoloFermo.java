// Pong — Programmazione Orientata agli Oggetti e Laboratori, Udine, a.a. 2026-27
// Lezione 10: la superclasse degli ostacoli fermi.
package ostacoli;

import geometria.Rettangolo;

/**
 * Un ostacolo fermo: la sua area non cambia mai. Questa classe scrive una volta sola le righe
 * uguali di tutti gli ostacoli fermi: il campo area, getArea() e avanza() che non fa niente.
 * È astratta: non si può creare con new, perché da sola non sa come si rompe né di che colore è.
 * Gli altri tre metodi dell'accordo (colpisci, isRotto, getColore) li scrivono le sottoclassi.
 * Promette: l'area non cambia mai (getArea() dà sempre lo stesso rettangolo).
 */
public abstract class OstacoloFermo implements Ostacolo {

    private final Rettangolo area;

    /** Pretende: area non è null. */
    public OstacoloFermo(Rettangolo area) {
        this.area = area;
    }

    @Override
    public Rettangolo getArea() { return area; }

    @Override
    public void avanza() {
        // niente: è fermo
    }

    @Override
    public String toString() {
        return "ostacolo fermo in (" + area.x() + ", " + area.y() + ")" + (isRotto() ? ", rotto" : "");
    }
}
