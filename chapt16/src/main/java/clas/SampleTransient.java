package clas;

import java.io.Serializable;

public class SampleTransient implements Serializable {
    transient String name;
    String surname;
}
