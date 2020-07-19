package arrayvisitors.visitors;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.InvalidPathException;

import arrayvisitors.adt.MyArrayI;
import arrayvisitors.adt.MyArrayListI;

public interface Visitor {
    public void visit(MyArrayI inMyArrObj)
            throws InvalidPathException, SecurityException, FileNotFoundException, IOException;
    
    public void visit(MyArrayListI inMyArrayListI);

}