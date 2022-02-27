package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import asciiPanel.*;

@Configuration
public class AsciiFontConfig {
    @Bean 
    public AsciiPanel panel(){
        return new AsciiPanel(asciiFontTalrythSquare_15x15(), 40, 20);
    }

    @Bean
    public AsciiFont asciiFontCP437_9x16(){
        return new AsciiFontCP437_9x16();
    }

    @Bean 
    public AsciiFont asciiFontCP437_8x8(){
        return new AsciiFontCP437_8x8();
    }

    @Bean 
    public AsciiFont asciiFontCP437_10x10(){
        return new AsciiFontCP437_10x10();
    }

    @Bean 
    public AsciiFont asciiFontCP437_12x12(){
        return new AsciiFontCP437_12x12();
    }

    @Bean 
    public AsciiFont asciiFontCP437_16x16(){
        return new AsciiFontCP437_16x16();
    }

    @Bean 
    public AsciiFont asciiFontDrake_10x10(){
        return new AsciiFontDrake_10x10();
    }

    @Bean 
    public AsciiFont asciiFontQbicfeet_10x10(){
        return new AsciiFontQbicfeet_10x10();
    }

    @Bean 
    public AsciiFont asciiFontTaffer_10x10(){
        return new AsciiFontTaffer_10x10();
    }

    @Bean 
    public AsciiFont asciiFontTalrythSquare_15x15(){
        return new AsciiFontTalrythSquare_15x15();
    }
}