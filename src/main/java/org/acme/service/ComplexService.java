package org.acme.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ComplexService {

    public String someComplexCalculation() {
        return "You can''t understand me, I''m too complex ";
    }

}
