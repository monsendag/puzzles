package paginator;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PaginatorHelperTest {

    private PaginationHelper<Character> helper;

    @Test
    public void testHelper() {
        ArrayList<Character> arr = new ArrayList<>();

        arr.add('a');
        arr.add('a');
        arr.add('a');
        arr.add('a');
        arr.add('a');
        arr.add('a');

        PaginationHelper<Character> helper = new PaginationHelper<>(arr, 4);

        assertEquals(2, helper.pageCount());
        assertEquals(6, helper.itemCount());

        assertEquals(4, helper.pageItemCount(0));
        assertEquals(2, helper.pageItemCount(1));
        assertEquals(-1, helper.pageItemCount(2));

        assertEquals(1, helper.pageIndex(5));
        assertEquals(0, helper.pageIndex(2));
        assertEquals(-1, helper.pageIndex(20));
        assertEquals(-1, helper.pageIndex(-10));

    }

}