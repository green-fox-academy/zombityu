package com.example.color.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrintMyColor implements MyColor {

  @Autowired
  private Printer printer;

  public PrintMyColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("This is my color");
  }
}
