/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.io.IOException;

/**
 *
 * @author aitor
 */
public class kata3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        MailReader mailReader = new MailReader("mails.txt");
        HistrogramBuilder<String> builder = new HistrogramBuilder();
        Histogram<String> histogram = builder.build(mailReader.redDomains());
        new HistogramViewer<String>().print(histogram);
    }
}
