/*
 * Copyright (c) 2008, 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * @test
 *
 * @summary converted from VM Testbase jit/t/t099.
 * VM Testbase keywords: [jit, quick]
 *
 * @library /vmTestbase
 *          /test/lib
 * @run driver jdk.test.lib.FileInstaller . .
 * @build jit.t.t099.t099
 * @run driver ExecDriver --java jit.t.t099.t099
 */

package jit.t.t099;

import nsk.share.TestFailure;
import nsk.share.GoldChecker;

class t099
{
    public static final GoldChecker goldChecker = new GoldChecker( "t099" );

    static void foo(int a, int b, int c, int d, int e,
                    int f, int g, int h, int i, int j)
    {
        foo(a,b,c,d,e,f,g,h,i,j);
    }

    public static void main(String[] argv)
    {
        try
        {
            foo(1,2,3,4,5,6,7,8,9,10);
        }
        catch (Throwable t)
        {
            t099.goldChecker.println(t.toString() + " detected, thrown, and caught.");
        }
        t099.goldChecker.check();
    }
}
