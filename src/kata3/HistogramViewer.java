/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

/**
 *
 * @author aitor
 */
public class HistogramViewer<Type> {
    public void print(Histogram<Type> histogram){
        for (Type type : histogram.keySet()) {
            System.out.println(type + "->" + histogram.get(type));
        }
    
    }
}
