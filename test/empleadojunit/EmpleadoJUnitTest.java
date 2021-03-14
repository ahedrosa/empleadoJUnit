/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadojunit;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Alex'sCucumbah
 */

@RunWith(value=Parameterized.class)
public class EmpleadoJUnitTest {
    
     
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
   
    
    @Parameters
    public static ArrayList<Object[]> getData(){
        ArrayList<Object[]> param = new ArrayList<>();
        param.add(new Object[]{"001","02","jardinero","ER3"});
        param.add(new Object[]{"001","02","programador","2000"});
        param.add(new Object[]{"001","02","diseñador","1500"});
        param.add(new Object[]{"001","02","analista","2500"});
        param.add(new Object[]{"001","-2","analista","ER2"});
        param.add(new Object[]{"001","100","analista","ER2"});
        param.add(new Object[]{"001","111","analista","ER2"});
        param.add(new Object[]{"-11","02","analista","ER1"});
        param.add(new Object[]{"no","02","analista","ER1"});
        param.add(new Object[]{"110","02","analista","ER1"});
        param.add(new Object[]{"","02","analista","ER1"});
        param.add(new Object[]{"1515","02","analista","ER1"});
        
        
        return param;
    }
    
    private String emp, dep, ofi, salida;
    
    public EmpleadoJUnitTest(String emp, String dep, String ofi, String salida) {
        
        this.emp=emp;
        this.dep=dep;        
        this.ofi=ofi;
        this.salida=salida;
    }
   
    /**
     * Test of asignarSueldo method, of class EmpleadoJUnit.
     */
    @Test
    public void testAsignarSueldo() {
        System.out.println("asignarSueldo");        
        String sal = EmpleadoJUnit.asignarSueldo(emp, dep, ofi);
        assertEquals(salida, sal);
        
    }
    
}
