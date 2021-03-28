package week6;

import java.lang.reflect.Array;

import org.omg.DynamicAny.DynArray;

public class ExpandableArray {

private static Object[] newArray = null;


public ExpandableArray() {
newArray = new Object[0]; // Allows us to check length of array
                              // even when no elements exist
}
public void set(int index, Object value) {
    if (index >= newArray.length) {
    	
    	Object[] newArray = new Object[index + 1];

    	for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray[i];
            
            newArray = newArray;
            
            newArray[index] = value;}}}

            
            public Object get(int index) {
                if (index >= Array.getLength(null)) return null;
                return newArray[index];

            }
            
}
