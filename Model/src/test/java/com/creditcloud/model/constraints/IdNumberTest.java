/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constraints;

import com.creditcloud.model.User;
import static com.creditcloud.model.constraints.BaseTest.validator;
import javax.validation.Validation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sobranie
 */
public class IdNumberTest extends BaseTest<User> {

    private static final String[] validIdNumbers = {"42010619620204815X",
                                                    //male idNumber   
                                                    "230109198810127372",
                                                    "230184198711288437",
                                                    "620201197709074811",
                                                    "220581198609168130",
                                                    "652328198102125878",
                                                    "450222198007162774",
                                                    "320302198102025875",
                                                    "152201198310074717",
                                                    "210505197602227836",
                                                    "130304198601048438",
                                                    "130824198712177753",
                                                    "370685198209025871",
                                                    "421223198711056854",
                                                    "41092819760212227X",
                                                    "530322197606195990",
                                                    "14102419900818403X",
                                                    "61060119870804237X",
                                                    "620702199307117674",
                                                    "44051219891027845X",
                                                    "530501199405208618",
                                                    "140303197809262178",
                                                    "220281198110129558",
                                                    "520627198410203873",
                                                    "150423198207084973",
                                                    //female idNumber
                                                    "430721199205271682",
                                                    "220302198807155326",
                                                    "130105198005174783",
                                                    "610430198806223343",
                                                    "530101199311131961",
                                                    "654323199203108967",
                                                    "341825198708145640",
                                                    "341721198209232888",
                                                    "320312198705096544",
                                                    "141102198707029621",
                                                    "653128198312158248",
                                                    "620702198003195804",
                                                    "230183198305095801",
                                                    "140201198005223401",
                                                    "141129197603199963",
                                                    "451101198811048845",
                                                    "370724197606112280",
                                                    "431125198810077801",
                                                    "650204198107019929",
                                                    "231084198603031349",
                                                    "320506197804088004",
                                                    "610729198403225169",
                                                    "371623198207156626",
                                                    "13092719800814598X"};

    public IdNumberTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        object = new User("123", "123", "123", "123", "123", "123", null, null);
    }

    @After
    public void tearDown() {
        constraintViolations.clear();
    }

    @Test
    public void notNull() {
        object.setIdNumber(null);
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(2, constraintViolations.size());
    }

    @Test
    public void pattern() {
        /**
         * accepted idnumber
         */
        //18 numbers
        for (String idNumber : validIdNumbers) {
            object.setIdNumber(idNumber);
            constraintViolations = validator.validateProperty(object, "idNumber");
            assertEquals(0, constraintViolations.size());
        }

        /**
         * illegal idnumber
         */
        //illegal character        
        object.setIdNumber("510105198808x62022");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());
        object.setIdNumber("5101058808x6202");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());


        //17 numbers
        object.setIdNumber("51010519880806202");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());

        //19 numbers;
        object.setIdNumber("5101051988080620222");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());

        //wrong checkcode;
        object.setIdNumber("510105198808062023");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());

        //wrong province;
        object.setIdNumber("5901051988080620222");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());

        //wrong year;
        object.setIdNumber("510105229908062022");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());

        //wrong year;
        object.setIdNumber("510105189908062022");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());

        //wrong month;
        object.setIdNumber("510105198813062022");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());

        //wrong day
        object.setIdNumber("510105198809312022");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());

        //last 'X' must be upper case
        object.setIdNumber("42010619620204815x");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());

        //start with **0000 is province code
        object.setIdNumber("42000019620204815x");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());

        //start with ****00 is city code
        object.setIdNumber("42010019620204815x");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());

        //come for taiwan
        object.setIdNumber("71010019620204815x");
        constraintViolations = validator.validateProperty(object, "idNumber");
        assertEquals(1, constraintViolations.size());

    }
}