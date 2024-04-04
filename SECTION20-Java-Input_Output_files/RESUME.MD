
Voici un résumé des entrées/sorties (Input & Output) de fichiers en Java avec des exemples de code montrant les packages importés, leur utilisation, et des explications :

1. ## Lecture de fichiers :

```bash
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectureFichier {
    public static void main(String[] args) {
        try {
            BufferedReader lecteur = new BufferedReader(new FileReader("monFichier.txt"));
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                System.out.println(ligne);
            }
            lecteur.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
