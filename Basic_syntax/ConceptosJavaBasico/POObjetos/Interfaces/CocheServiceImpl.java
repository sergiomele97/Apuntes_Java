package ConceptosJavaBasico.POObjetos.Interfaces;

import ConceptosJavaBasico.POObjetos.Coche;
import ConceptosJavaBasico.POObjetos.CocheElectrico;

public class CocheServiceImpl implements CocheService{

    @Override
    public Coche crearCocheDemo() {
        return new CocheElectrico();
    } // implementamos una interfaz

}
