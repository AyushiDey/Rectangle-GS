package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void areaWhenLengthAndBreadthGiven(){
        Rectangle rect = new Rectangle(5, 10);
        int ar = rect.area();
        assertThat(ar, is(50));
    }
}
