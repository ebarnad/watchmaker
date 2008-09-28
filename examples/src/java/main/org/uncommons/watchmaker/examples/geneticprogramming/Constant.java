// ============================================================================
//   Copyright 2006, 2007 Daniel W. Dyer
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.
// ============================================================================
package org.uncommons.watchmaker.examples.geneticprogramming;

/**
 * @author Daniel Dyer
 */
public class Constant implements Node
{
    private final double constant;

    public Constant(double constant)
    {
        this.constant = constant;
    }


    public int getDepth()
    {
        return 1;
    }


    public double evaluate(double[] programParameters)
    {
        return constant;
    }


    public String print()
    {
        return String.valueOf(constant);
    }
}