package integradoraM4;

import org.junit.platform.suite.api.SelectClasses;
/*import org.junit.platform.suite.api.SelectMethod;*/
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Suite Test Integradora M4")
/*@SelectMethod(type = CuentaTest.class, name = "testRecuperaSaldo")*/
@SelectClasses({CuentaTest.class, DolarTest.class, EuroTest.class, SubMenuMonedaTest.class, SubMenuMontoTest.class, MenuPrincipalTest.class})
public class SuiteTestWallet {

}
