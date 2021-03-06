/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo2lab2z1izvod;

/**
 *
 * @author Nikola
 */
public class Razlika extends Binarni {
    
    public Razlika(Izraz levi, Izraz desni) {
        super(levi, desni);
    }

    @Override
    public char znak() {
        return '-';
    }

    @Override
    public double operacija() {
        return levaVrednost_ - desnaVrednost_;
    }

    @Override
    public Izraz izvod(Promenljiva p) {
        return new Razlika(levi().izvod(p), desni().izvod(p));
    }
}
