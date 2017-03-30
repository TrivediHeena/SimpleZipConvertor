/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package simplezipconvertor;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fdsh
 */
public class SimpleZipConvertorViewTest {

    public SimpleZipConvertorViewTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of showAboutBox method, of class SimpleZipConvertorView.
     */
    @Test(expected=NullPointerException.class)
    public void testShowAboutBox() {
        System.out.println("showAboutBox");
        SimpleZipConvertorView instance = null;
        instance.showAboutBox();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateFileList method, of class SimpleZipConvertorView.
     */
    @Test(expected=NullPointerException.class)
    public void testGenerateFileList() {
        System.out.println("generateFileList");
        File node = null;
        SimpleZipConvertorView instance = null;
        instance.generateFileList(node);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}