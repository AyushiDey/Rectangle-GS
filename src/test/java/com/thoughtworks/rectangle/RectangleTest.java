package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void shouldReturnAreaWhenLengthAndBreadthGiven(){
        Rectangle rect = new Rectangle(2.5, 5.5);
        double ar = rect.area();
        assertThat(ar, is(closeTo(13.75, 0.2)));
    }

    @Test
    public void shouldReturnPerimeterWhenLengthAndBreadthGiven(){
        Rectangle rect = new Rectangle(2.5, 5.5);
        double per = rect.perimeter();
        assertThat(per, is(closeTo(16.00, 0.2)));
    }
}
