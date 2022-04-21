package org.example.provider;

import org.example.converter.KiloConverter;

public class KiloToPoundsConverter implements KiloConverter {
    @Override
    public double convert(double kg) {
        return kg * 2.2046;
    }
}