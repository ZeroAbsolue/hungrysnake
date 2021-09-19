package com.example;

/* Cette classe permet d'identifier une cellule dans une aire de jeu */
public class Cellule {

    public Integer ligne;
    public Integer colonne;

    public Cellule(int ligne, int colonne) {
        super();
        this.ligne = ligne;
        this.colonne = colonne;
    }


    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((colonne == null) ? 0 : colonne.hashCode());
        result = prime * result + ((ligne == null) ? 0 : ligne.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cellule other = (Cellule) obj;
        if (colonne == null) {
            if (other.colonne != null)
                return false;
        } else if (!colonne.equals(other.colonne))
            return false;
        if (ligne == null) {
            if (other.ligne != null)
                return false;
        } else if (!ligne.equals(other.ligne))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "{" +
            " ligne = '" + ligne + "'" +
            ", colonne = '" + colonne  + "'" +
            "}";
    }
    
}
