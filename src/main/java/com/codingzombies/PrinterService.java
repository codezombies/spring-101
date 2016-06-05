/**
 * Coding Zombies, LLC 2016
 */
package com.codingzombies;

import javax.annotation.Resource;

public class PrinterService {

    @Resource
    private Printer printer;

    public void print(String stringToPrint) {
        printer.print(stringToPrint);
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
}
