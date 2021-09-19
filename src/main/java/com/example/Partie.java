package com.example;

public class Partie {
    Cellule morceau;
    Action action;

    public Cellule getMorceau() {
        return this.morceau;
    }

    public void setMorceau(Cellule morceau) {
        this.morceau = morceau;
    }

    public Action getAction() {
        return this.action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public Partie(Cellule partie, Action action) {
        this.morceau = partie;
        this.action = action;
    }

    public void allerADroite() {
        morceau.colonne++;
    }

    public void allerAGauche() {
        morceau.colonne--;
    }

    public void monter() {
        morceau.ligne--;
    }

    public void descendre() {
        morceau.ligne++;
    }

    public void bouger() {
        if (action == Action.MONTER) {
            monter();
        }
        if (action == Action.DESCENDRE) {
            descendre();
        }
        if (action == Action.GAUCHE) {
            allerAGauche();
        }
        if (action == Action.DROITE) {
            allerADroite();
        }

    }


    @Override
    public String toString() {
        return "{" +
            " partie='" + getMorceau() + "'" +
            ", action='" + getAction() + "'" +
            "}";
    }
    

}
