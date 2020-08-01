package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldIncreaseCurrentTemperature(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(22);
        conditioner.increaseCurrentTemperature();
        assertEquals(23, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldDecreaseCurrentTemperature(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(22);
        conditioner.decreaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldIncreaseCurrentTemperatureMax(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        assertEquals(30, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldDecreaseCurrentTemperatureMin(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(15);
        conditioner.decreaseCurrentTemperature();
        assertEquals(15, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldIncreaseCurrentTemperatureMax29(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(29);
        conditioner.increaseCurrentTemperature();
        assertEquals(30, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldDecreaseCurrentTemperatureMin16(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(16);
        conditioner.decreaseCurrentTemperature();
        assertEquals(15, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldSetCurrentTemperatureMax(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(31);
        assertEquals(0, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldSetCurrentTemperatureMin(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(14);
        assertEquals(0, conditioner.getCurrentTemperature());
    }
}