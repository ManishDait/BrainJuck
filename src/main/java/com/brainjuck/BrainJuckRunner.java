/*
 * MIT License
 * Copyright (c) 2023 Manish Dait
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * 
 */

package com.brainjuck;

import com.brainjuck.error.BrainJuckException;
import com.brainjuck.handler.BrainJuckHandler;
import com.brainjuck.interpreter.BrainJuckInterpreter;

/**
 * BrainJuck
 * The {@link BrainJuckRunner} is the main runner class for BrainJuck.
 *
 * @author Manish Dait.
 */

public class BrainJuckRunner {
  /**
   * Runs the BrainJuckRunnerClass.
   *
   * @param args path of brainfuck file
   * @throws BrainJuckException if file path is invalid
   */
  public static void main(String[] args) throws BrainJuckException {
    System.out.println("\n[****  Brainjuck  ****]\n");

    if (args.length == 0) {
      System.out.println("...Specify a file path to interprete the code.");
    } else {
      String code = BrainJuckHandler.readFile(args[0]);
      new BrainJuckInterpreter(code);
    }
    
    System.out.println("\n");
  }
}
