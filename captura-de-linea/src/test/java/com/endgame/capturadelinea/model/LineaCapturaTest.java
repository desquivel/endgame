package  com.endgame.capturalinea.model;
import org.junit.*;

public class LineaCapturaTest{

    public testLineaCaptura(){
        LineaCaptura ln = new LineaCaptura();

        assertNotNull(ln);
        asserEquals("qwertyui123456789xc",ln.crear());

    }

}