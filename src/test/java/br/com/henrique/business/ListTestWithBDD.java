package br.com.henrique.business;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


import java.util.List;

import org.junit.jupiter.api.Test;

public class ListTestWithBDD {
    
    @Test
    void testMockingList_When_SizeIsCalled_ShouldReturn10() {
        
        // Given / Arrange
        List<?> list = mock(List.class);
        given(list.size()).willReturn(7);
        
        // When / Act & Then / Assert
        assertThat(list.size(), is(7));
        assertThat(list.size(), is(7));
        assertThat(list.size(), is(7));
    }
    
    @Test
    void testMockingList_When_SizeIsCalled_ShouldReturnMultipleValues() {
        
        // Given / Arrange
        List<?> list = mock(List.class);
        given(list.size()).willReturn(10).willReturn(20);
        
        // When / Act & Then / Assert
        assertThat(list.size(), is(10));
        assertThat(list.size(), is(10));
        assertThat(list.size(), is(10));
    }
    
    @Test
    void testMockingList_When_GetIsCalled_ShouldReturnErudio() {
        
        // Given / Arrange
        var list = mock(List.class);
        given(list.get(0)).willReturn("Erudio");
        
        // When / Act & Then / Assert
        assertThat(list.get(0), is("Erudio"));
        assertThat(list.get(1), isNull());
    }
    
    @Test
    void testMockingList_When_GetIsCalledWithArgumentMatcher_ShouldReturnErudio() {
        
        // Given / Arrange
        var list = mock(List.class);
        
        // If you are using argument matchers, all arguments
        // have to be provided by matchers.
        given(list.get(anyInt())).willReturn("Erudio");
        
        // When / Act & Then / Assert
        assertThat(list.get(anyInt()), is("Erudio"));
        assertThat(list.get(anyInt()), is("Erudio"));
    }
    
    @Test
    void testMockingList_When_ThrowsAnException() {
        
        // Given / Arrange
        var list = mock(List.class);
        
        // If you are using argument matchers, all arguments
        // have to be provided by matchers.
        when(list.get(anyInt())).thenThrow(new RuntimeException("Foo Bar!!"));
        
        // When / Act & Then / Assert
        assertThrows(RuntimeException.class,
            () -> {
                // When / Act
                list.get(anyInt());},
            () -> "Should have throw an RuntimeException");
    }

}
