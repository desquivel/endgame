package com.endgame.capturadelinea.model;

import com.endgame.capturadelinea.model.LineaCaptura;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LineaCapturaTest{

    public void testLineaCaptura(){
        LineaCaptura ln = new LineaCaptura();

        assertNotNull(ln);
        assertEquals("qwertyui123456789xc",ln.generar());

    }

}