import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class MSOECommissionCalculatorTest {


    @Test
    public void constructorShouldConstructCalculatorWhenGivenValidInputs() throws Exception {
        //Arrange
        String name = "Test Name";
        int experience = 0;

        //Act
        MSOECommissionCalculator calculator = new MSOECommissionCalculator(name, experience);

        String actualName = calculator.getName();
        int actualExperience = calculator.getEmployeeExperience();

        //Assert
        assertEquals(actualName, name);
        assertEquals(actualExperience, experience);

    }

    @Test
    public void addSaleShouldCorrectAddSaleWhenSaleTypeisValid() throws Exception {
        //Arrange
        MSOECommissionCalculator calculator = new MSOECommissionCalculator("Test Name", 0);

        //Act
         calculator.addSale(1, 100.0);

         //Assert
        assertEquals(calculator.getTotalSales(), 100.0);
    }

}