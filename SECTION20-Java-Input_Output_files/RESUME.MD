# Input & Output Working with Files in JAVA

Travailler avec les entrées/sorties (Input & Output) de fichiers en Java est crucial pour manipuler des fichiers sur le système de fichiers local.

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

Dans cet exemple, j'importe les classes BufferedReader et FileReader depuis le package java.io. J'utilise BufferedReader pour lire les données de manière efficace depuis un fichier texte. FileReader est utilisé pour créer un flux de lecture de fichier. J'utilise une boucle while pour lire chaque ligne du fichier jusqu'à la fin, en utilisant la méthode readLine() de BufferedReader. Enfin, je ferme le lecteur à l'aide de la méthode close() pour libérer les ressources.

2. ## Écriture dans des fichiers :

```bash
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EcritureFichier {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("nouveauFichier.txt"));
            writer.write("Contenu à écrire dans le fichier.");
            writer.newLine(); // Ajoute une nouvelle ligne
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

Dans cet exemple, je importe les classes BufferedWriter et FileWriter depuis le package java.io. J'utilise BufferedWriter pour écrire les données de manière efficace dans un fichier texte. FileWriter est utilisé pour créer un flux d'écriture de fichier. J'utilise la méthode write() de BufferedWriter pour écrire du contenu dans le fichier. La méthode newLine() est utilisée pour ajouter une nouvelle ligne. Enfin, je ferme le writer à l'aide de la méthode close() pour libérer les ressources.

3. ## Manipulation de fichiers :

```bash
import java.io.File;
import java.io.IOException;

public class ManipulationFichiers {
    public static void main(String[] args) {
        // Création d'un nouveau fichier
        try {
            File nouveauFichier = new File("nouveauFichier.txt");
            if (nouveauFichier.createNewFile()) {
                System.out.println("Le fichier a été créé !");
            } else {
                System.out.println("Le fichier existe déjà.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Suppression d'un fichier existant
        File fichierASupprimer = new File("fichierASupprimer.txt");
        if (fichierASupprimer.delete()) {
            System.out.println("Le fichier a été supprimé !");
        } else {
            System.out.println("Impossible de supprimer le fichier.");
        }
    }
}

```

Dans cet exemple, je importe la classe File depuis le package java.io. File est employée pour représenter les chemins des fichiers et des répertoires. Pour créer un nouveau fichier, nous utilisons la méthode createNewFile(). Si la création réussit, cette méthode renvoie true ; sinon, si le fichier existe déjà, elle renvoie false. Pour supprimer un fichier, nous utilisons la méthode delete(). Si la suppression réussit, cette méthode renvoie true ; sinon, elle renvoie false.
