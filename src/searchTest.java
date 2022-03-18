import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class searchTest
{
        int[] array = {1,2,4,9,3,6,5,7,10};
        int[] num = {};
    @Test
    void array7()
    {
        int expected = 7;
        int actual =  search.sort(array,7);
        assertEquals(expected,actual);
    }

    @Test
    void array1()
    {
     int expected = 0;
     int actual = search.sort(array,1);
     assertEquals(expected,actual);
    }

    @Test
    void array6()
    {
        int expected = 6;
        int actual =  search.sort(array,6);
        assertEquals(expected,actual);
    }

    @Test
    void array10()
    {
        int expected = 8;
        int actual = search.sort(array,10);
        assertEquals(expected,actual);

    }

    @Test
    void array3()
    {
        int expected = 4;
        int actual = search.sort(array,3);
        assertEquals(expected,actual);

    }

    @Test
    void array9()
    {
        int expected = 4;
        int actual = search.sort(array, 9);
        assertEquals(expected,actual);

    }

    @Test
    void empty(){
        int expected = -1;
        int actual = search.sort(num, 9);
        assertEquals(expected,actual);
    }



}