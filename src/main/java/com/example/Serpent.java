package com.example;

import java.util.ArrayList;
import java.util.List;

public class Serpent {

    public List<Partie> corps;

    public Serpent(Cellule cellule) {
        this.corps = new ArrayList<Partie>();
        manger(cellule, Action.AUCUN);
    }

    public int taille() {
        return this.corps.size();
    }

    public void allerADroite() {
        deplacer(Action.DROITE);
    }

    public void manger(Cellule cellule, Action action) {
        Partie viande = new Partie(cellule, Action.AUCUN);
        if (corps.size() == 1)
            corps.get(0).setAction(action);
        else if (corps.size() > 1)
            corps.get(corps.size() - 1).setAction(action);
        corps.add(viande);

    }

    public void deplacer(Action action) {

        if (corps.size() > 1) {
            corps.get(corps.size() - 1).setAction(action);
        }

        for (int i = 0; i < corps.size(); i++) {
            /*
             * Ici j"ai deux possibilit√©, soit je modifie l'action et je bouge, soit je
             * donne la place du precedent element
             */

            corps.get(i).bouger();

            if (i + 1 < corps.size()) {
                corps.get(i).setAction(corps.get(i + 1).getAction());
            }
        }

        corps.get(corps.size() - 1).setAction(Action.AUCUN);
    }

    public void allerAGauche() {
        deplacer(Action.GAUCHE);
    }

    public void monter() {
        deplacer(Action.MONTER);
    }

    public void descendre() {
        deplacer(Action.DESCENDRE);
    }

    public String afficherCorps() {
        String corpsString = "";
        for (int i = corps.size(); i > 0; i--) {
            corpsString += corps.get(i - 1).morceau + "" + corps.get(i - 1).action;
        }
        return corpsString;
    }

    @Override
    public String toString() {
        return "Serpent {" + afficherCorps() + "'" + "taille '" + corps.size() + "}";
    }

}
