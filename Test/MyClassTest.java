import org.junit.Test;

import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testclassifyTrainingPoint() {
        MyClass tester = new MyClass();

        //Kiem thu lop tuong duong
        assertEquals("30 - Yeu", "Yeu", tester.classifyTrainingPoint(30));
        assertEquals("60 - Trung binh", "Trung binh", tester.classifyTrainingPoint(60));
        assertEquals("70 - Kha", "Kha", tester.classifyTrainingPoint(70));
        assertEquals("85 - Tot", "Tot", tester.classifyTrainingPoint(85));
        assertEquals("95 - Xuat sac", "Xuat sac", tester.classifyTrainingPoint(95));
        assertEquals("122 - Không hop le", "Khong hop le", tester.classifyTrainingPoint(122));

        //Kiem thu gia tri bien
        assertEquals("0 - Yeu", "Yeu", tester.classifyTrainingPoint(0));
        assertEquals("1 - Yeu", "Yeu", tester.classifyTrainingPoint(1));
        assertEquals("50 - Trung binh", "Trung binh", tester.classifyTrainingPoint(50));
        assertEquals("99 - Xuat sac", "Xuat sac", tester.classifyTrainingPoint(99));
        assertEquals("100 - Xuat sac", "Xuat sac", tester.classifyTrainingPoint(100));
    }
}