package strategy;

import factory.CreadorPeluche;
import paquete.Juguete;

import java.util.List;

public class AccionCrearPeluche implements Accion {

    private static AccionCrearPeluche instanciaAccion;

    @Override
    public List<Juguete> ejecutar(List<Juguete> juguetes) {
        juguetes.add(new CreadorPeluche().crear());
        return juguetes;
    }

    @Override
    public Accion getInstance() {
        if (instanciaAccion == null) {
            instanciaAccion = new AccionCrearPeluche();
        }
        return instanciaAccion;
    }

    @Override
    public int getOpcion() {
        return 1;
    }

    @Override
    public String getOpcionComoString() {
        return getOpcion() + ": Crear peluche";
    }
}