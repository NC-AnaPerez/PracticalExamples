package mx.edu.j2se.lectures.examples.lecture2.p1modifiers.others;

import java.io.*;
import java.util.Base64;

public class MumboJumboSerialize {

    public static String convertToString(Serializable toTransform) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream( baos );
            oos.writeObject( toTransform );
            oos.close();
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        } catch (IOException io) {
            return null;
        }
    }

    public static <T> T convertFromString(String source) {
        try {
            if( source == null ) return null;
            byte [] data = Base64.getDecoder().decode( source );
            ObjectInputStream ois = new ObjectInputStream( new ByteArrayInputStream(  data ) );
            Object o  = ois.readObject();
            ois.close();
            return (T) o;
        } catch (IOException | ClassNotFoundException io) {
            return null;
        }
    }
}
