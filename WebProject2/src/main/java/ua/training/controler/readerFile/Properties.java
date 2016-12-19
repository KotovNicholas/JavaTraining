package ua.training.controler.readerFile;

/**
 * Created by Nicholas Kotov on 05.12.2016.
 */
public enum Properties { ADRESS("Text.txt");

    public String sdress;

    Properties() {
    }

    Properties(String sdress) {
        this.sdress = sdress;
    }

    public String getValue(){return sdress;}
}
