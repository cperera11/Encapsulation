/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;

/**
 *
 * @author cperera
 */
public class ReportService {
    private String reportOutput;
    private String reportInput;
    
    public ReportService(String reportOut){
    this.reportOutput = reportOut;
    }

    public ReportService() {
     }
    
     //public void printReport(String firstName, String lastName, Date getDate, String description ) {
       //System.out.println(firstName + " " + lastName + description
        //    + getDate);
       // corect way
       public void printReport(String msg){
       System.out.println(msg);}
    }
     
     

