/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

/**
 *
 * @author aitor
 */
public class HistrogramBuilder <Type> {
    public Histogram <Type> build (Type[] types){
        Histogram<Type> histogram = new Histogram <Type>();
        for (Type type : types) {
            if(histogram.containsKey(type)){
                histogram.put(type,histogram.get(type)+1);
            }else{
                histogram.put(type,1);
            }
         }
         return histogram;
     } 
}